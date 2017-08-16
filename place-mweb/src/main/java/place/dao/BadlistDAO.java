package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import place.vo.BadList;

public class BadlistDAO {
	
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	public List<BadList> selectAll(){
		return ss.selectList("badlist.selectAll");
	}
	
	public BadList selectByUser(int user_no){
		return ss.selectOne("badlist.selectByUser", user_no);
	}
	
	public BadList selectByPlace(int place_no){
		return ss.selectOne("badlist.selectByPlace", place_no);
	}
	
	public void insertOne(BadList badlist){
		ss.insert("badlist.insertOne", badlist);
	}
	

	
}
