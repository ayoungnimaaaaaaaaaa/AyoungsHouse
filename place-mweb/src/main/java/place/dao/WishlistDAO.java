package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import place.vo.WishList;
@Repository
public class WishlistDAO {

	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	public List<WishList> selectAll(){
		return ss.selectList("wishlist.selectAll");
	}
	
	public List<WishList> selectByUser(int user_no){
		return ss.selectList("wishlist.selectByUser", user_no);
	}
	
	public List<WishList> selectByPlace(int place_no){
		return ss.selectList("wishlist.selectByPlace", place_no);
	}
	
	public void insertOne(WishList wishlist){
		ss.insert("wishlist.insertOne", wishlist);
	}
	

}
