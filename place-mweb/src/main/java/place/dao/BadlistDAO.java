package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import place.vo.BadList;

@Repository 
public class BadlistDAO {
	
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	public List<BadList> selectAll(){
		return ss.selectList("badlist.selectAll");
	}
	
	public List<BadList> selectByUser(int user_no){
		return ss.selectList("badlist.selectByUser", user_no);
	}
	
	public List<BadList> selectByPlace(int place_no){
		return ss.selectList("badlist.selectByPlace", place_no);
	}
	
	public void insertOne(BadList badlist){
		ss.insert("badlist.insertOne", badlist);
	}
	

	
}
