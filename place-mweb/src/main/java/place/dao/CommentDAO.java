package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import place.vo.Comment;

public class CommentDAO {

	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	public List<Comment> selectAll(){
		return ss.selectList("comment.selectAll");
	} 
	public void insertOne(Comment comment){
		ss.insert("comment.insertOne", comment);
	}
	public void deleteOne(int comment_no){
		ss.delete("comment.deleteOne", comment_no);
	}
	public void updateOne(Comment comment){
		ss.update("comment.updateOne", comment);
	}
	
}
