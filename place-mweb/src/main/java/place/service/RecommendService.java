package place.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import place.vo.Comment;
import place.vo.BadList;
import place.vo.Recommend_info;
import place.vo.Review;
import place.vo.WishList;

@Service
public class RecommendService {
	
	@Autowired
	DataService dataService;
	@Autowired
	DataService ApiService; //여기꺼 searchLocal()하면음식점정보

	//내 주변꺼 추천해줘야되는데
	//이러면 지역이 여러개인데 얘랑 비슷한거중에 내주변에잇는거?
	public List<Recommend_info> setRecommendList(String userId){
		double weight = 0;
		List<Recommend_info> RecommendList = dataService.getRecommendInfo(userId); 
		//user가 클릭해봤던 place (score 기본값 0.01) 
		//클릭할때마다 +0.01씩하는거 구현해야함
		
		List<WishList> wishlist = dataService.getWishlist(userId);		
		List<Integer> wishPlaceList = new ArrayList<Integer>(); //wishlist에 담겨있는 place번호
		for (WishList wl : wishlist) {
			wishPlaceList.add(wl.getPlace_no());
		}

		List<BadList> badlist = dataService.getBadlist(userId);
		List<Integer> badPlaceList = new ArrayList<Integer>(); //badlist에 담겨있는 place번호
		for(BadList bl : badlist){
			badPlaceList.add(bl.getPlace_no());
		}
		
		List<Review> reviewList = dataService.getReview(userId);
		//List<Integer> reviewPlaceList = new ArrayList<Integer>();
		HashMap<Integer, Integer> reviewPlaceList = new HashMap<>();
		for (Review review : reviewList) {
			reviewPlaceList.put(review.getPlace_no(),review.getGrade());
		}
		
		List<Comment> commentList = dataService.getComment(userId);
		HashMap<Integer, Integer> commentPlaceList = new HashMap<>();
		for (Comment comment : commentList) {
			commentPlaceList.put(comment.getPlace_no(),comment.getGrade());
		}
		
		for (Recommend_info ri : RecommendList){			
			int place_no = ri.getPlace_no(); //클릭해봤던플레이스번호가
			if(wishPlaceList.contains(place_no)){ //wishlist에 있었으면
				System.out.println("wishlist:"+ri.getPlace_no());
				ri.setScore(ri.getScore()*0.3); //가중치 0.3로 score 높임
			}
			if(badPlaceList.contains(place_no)){ //badlist에 있으면
				System.out.println("badlist:"+ri.getPlace_no());
				ri.setScore(ri.getScore()*0.0001); //가중치 0.0001로 score 매우낮춤
			}
			if(reviewPlaceList.containsKey(place_no)){ //reviewList에 있으면
				System.out.println("reviewlist:"+ri.getPlace_no());
				int grade = reviewPlaceList.get(place_no);
				weight = getWeightByGrade(grade) + 0.05; //comment보단 가중치더줌
				ri.setScore(ri.getScore()*weight);
				reviewPlaceList.remove(place_no);
			}
			//여기서 comment랑 review 둘다남겨서 1넘어가면어캄?
			if(commentPlaceList.containsKey(place_no)){
				int grade = commentPlaceList.get(place_no);
				weight = getWeightByGrade(grade);
				ri.setScore(ri.getScore()*weight);
				commentPlaceList.remove(place_no);
			}
		}
	
		
		//클릭은 안해봤지만 리뷰랑코멘트는 남겼던거 처리
		for(int no : reviewPlaceList.keySet()){
			
		}
		for(int no : commentPlaceList.keySet()){
			
		}
		return RecommendList;
		
	}
	
	public double getWeightByGrade(int grade){
		double weight = 0;
		if(grade==1){
			weight = grade * 0.001 ;
		}else if(grade==2){
			weight = grade * 0.002 ;
		}else if(grade==3){
			weight = grade * 0.3;
		}else if(grade==4){
			weight = grade * 0.4;
		}else if(grade==5){
			weight = grade * 0.5;
		}
		return weight;
	}
	public double rescore(String userId){	
		return 0;
	}
	
}
