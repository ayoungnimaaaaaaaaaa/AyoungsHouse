package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import place.vo.User;

public class UserDAO {

	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	public List<User> selectAll(){
		return ss.selectList("user.selectAll");
	} 
	public void insertOne(User user){
		ss.insert("user.insertOne", user);
	}
	public void deleteOne(String id){
		ss.delete("user.deleteOne", id);
	}
	public void updateOne(User user){
		ss.update("user.updateOne", user);
	}
}
