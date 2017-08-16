package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import place.vo.WishList;

public class WishlistDAO {

	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	public List<WishList> selectAll(){
		return ss.selectList("wishlist.selectAll");
	}
	
	public WishList selectByUser(int user_no){
		return ss.selectOne("wishlist.selectByUser", user_no);
	}
	
	public WishList selectByPlace(int place_no){
		return ss.selectOne("wishlist.selectByPlace", place_no);
	}
	
	public void insertOne(WishList wishlist){
		ss.insert("wishlist.insertOne", wishlist);
	}
	

}
