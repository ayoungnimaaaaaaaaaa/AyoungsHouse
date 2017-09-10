package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import place.vo.Recommend_info;
@Repository
public class Recommend_infoDAO {
	SqlSession ss;
	
	public void setSs(SqlSession ss){
		this.ss = ss;
	}
	
	public List<Recommend_info> selectAll(){
		return ss.selectList("recommend_info.selectAll");
	}
	public List<Recommend_info> selectByUser(int user_no) {
		return ss.selectList("recommend_info.selectByUser",user_no);
	}
	public List<Recommend_info> selectByPlace(int place_no) {
		return ss.selectList("recommend_info.selectByPlace",place_no);
	}
	public Recommend_info selectOne(int info_no){
		return ss.selectOne("recommend_info.selectOne", info_no);
	}
	public void insertOne(Recommend_info ri){
		ss.insert("recommend_info.insertOne",ri);
	}
	public void updateClick(Recommend_info ri){
		ss.update("recommend_info.updateClick", ri);
	}
	public void updateScore(Recommend_info ri){
		ss.update("recommend_info.updateScore",ri);
	}


}
