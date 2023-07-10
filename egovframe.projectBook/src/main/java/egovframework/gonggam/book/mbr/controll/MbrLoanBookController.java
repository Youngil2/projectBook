package egovframework.gonggam.book.mbr.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbr")
public class MbrLoanBookController {

	@GetMapping("/addLoanBook.do") //  도서 대출 등록(회원)		
	public String addLoanBook() {
		return null;
	}
	@GetMapping("/findAllLoanInfo.do") //	도서 대출 이력 조회(회원)	
	public String mbrFindAllLoanInfo() {
		return null;
	}
}
