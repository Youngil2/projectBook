package egovframework.gonggam.admin.book_info.DAO;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	SqlSessionTemplate sst;
	
	
	public int insert(Map<String,Object> map) {
		return this.sst.insert("book.insert",map);
	}



}
