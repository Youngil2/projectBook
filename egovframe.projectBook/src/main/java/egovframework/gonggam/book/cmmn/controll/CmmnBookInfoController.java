package egovframework.gonggam.book.cmmn.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class CmmnBookInfoController {

	@GetMapping("/findAllBookInfo.do") //		도서 정보 목록 조회(공통)
	public String findAllBookInfo() { 
		return null;
	}
	
	@GetMapping("/findBookDetailInfo.do") //		도서 상세정보 조회(공통)
	public String findBookDetailInfo() {
		return null;
	}
	
	@GetMapping("/findBookInfo.do") //		카테고리 도서 조회(공통)
	public String findBookInfo() {
		return null;
	}
	
	
	

}
