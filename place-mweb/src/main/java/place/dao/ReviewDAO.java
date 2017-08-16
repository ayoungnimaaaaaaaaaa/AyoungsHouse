package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import place.vo.Review;

public class ReviewDAO {
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	public List<Review> selectAll(){
		return ss.selectList("review.selectAll");
	} 
	public void insertOne(Review review){
		ss.insert("review.insertOne", review);
	}
	public void deleteOne(int review_no){
		ss.delete("review.deleteOne", review_no);
	}
	public void updateOne(Review review){
		ss.update("review.updateOne", review);
	}
}
