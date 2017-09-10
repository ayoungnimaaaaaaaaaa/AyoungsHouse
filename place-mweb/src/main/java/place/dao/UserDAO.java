package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import place.vo.User;
@Repository
public class UserDAO {

	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	public List<User> selectAll(){
		return ss.selectList("user.selectAll");
	} 
	public User selectOne(String id){
		return ss.selectOne("user.selectOne",id);
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
