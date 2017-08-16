package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import place.vo.Comment;
import place.vo.Place;

public class PlaceDAO {
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	public List<Place> selectAll(){
		return ss.selectList("place.selectAll");
	} 
	public void insertOne(Place place){
		ss.insert("place.insertOne", place);
	}
	public void deleteOne(int place_no){
		ss.delete("place.deleteOne", place_no);
	}
	public void updateOne(Place place){
		ss.update("place.updateOne", place);
	}
}
