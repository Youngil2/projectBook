package egovframework.gonggam.admin.book_info.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import egovframework.gonggam.admin.book_info.DAO.BookDao;

public class BookServiceImpl implements BookService{
	
	@Autowired
	BookDao bdao;
	
	public String create(Map<String, Object> map) {
		int sucess = this.bdao.insert(map);
		if(sucess==1) {
			return map.get("book_id").toString();
		}
		return null;
	}



	

}
