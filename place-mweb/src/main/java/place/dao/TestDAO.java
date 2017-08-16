package place.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import place.vo.Test;

public class TestDAO {
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	public List<Test> selectAll(){
		return ss.selectList("test.selectAll");
	}
}
