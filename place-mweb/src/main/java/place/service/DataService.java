package place.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import place.dao.BadlistDAO;
import place.dao.CommentDAO;
import place.dao.PlaceDAO;
import place.dao.Recommend_infoDAO;
import place.dao.ReviewDAO;
import place.dao.UserDAO;
import place.dao.WishlistDAO;
import place.vo.BadList;
import place.vo.Place;
import place.vo.Recommend_info;
import place.vo.Review;
import place.vo.User;
import place.vo.WishList;
import place.vo.Comment;
@Service
public class DataService {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private PlaceDAO placeDAO;
	@Autowired
	private Recommend_infoDAO recoDAO;
	@Autowired
	private BadlistDAO badlistDAO;
	@Autowired
	private WishlistDAO wishlistDAO;
	@Autowired
	private ReviewDAO reviewDAO;
	@Autowired
	private CommentDAO commentDAO;
	
	/**user**/
	public User getUser(String userId){
		User user= userDAO.selectOne(userId);
		return user;
	}
	
	/**place**/
	public List<Place> getPlaceList(){
		return placeDAO.selectAll();
	}
	public Place getPlaceByName(String place_name){
		return placeDAO.SelectByName(place_name);
	}
	public Place getPlaceByAddress(String address) {
		return placeDAO.selectByAddress(address);
	}
	
	
	/**reco info**/
	//user가 클릭했던 place
	public List<Recommend_info> getRecommendInfo(String userId){
		User user = userDAO.selectOne(userId);
		int user_no = user.getUser_no();
		return recoDAO.selectByUser(user_no);
	}
	//score 리턴
	public double getRecommendInfoScore(int info_no){
		Recommend_info ri= recoDAO.selectOne(info_no);
		return ri.getScore();
	}
	
	
	/**wishlist**/
	public List<WishList> getWishlist(String userId){
		User user = userDAO.selectOne(userId);
		int user_no = user.getUser_no();
		return wishlistDAO.selectByUser(user_no);
	}
	public List<WishList> getWishlist(int user_no){
		return wishlistDAO.selectByUser(user_no);
	}
	
	
	/**badlist**/
	public List<BadList> getBadlist(String userId){
		User user = userDAO.selectOne(userId);
		int user_no = user.getUser_no();
		return badlistDAO.selectByUser(user_no);
	}
	public List<BadList> getBadlist(int user_no){
		return badlistDAO.selectByUser(user_no);
	}

	/**review**/
	public List<Review> getReview(String userId) {
		User user = userDAO.selectOne(userId); 
		int user_no = user.getUser_no();
		return reviewDAO.selectByUser(user_no);
	}

	/**comment**/
	public List<Comment> getComment(String userId) {
		User user = userDAO.selectOne(userId); 
		int user_no = user.getUser_no();
		return commentDAO.selectByUser(user_no);
	}
}
