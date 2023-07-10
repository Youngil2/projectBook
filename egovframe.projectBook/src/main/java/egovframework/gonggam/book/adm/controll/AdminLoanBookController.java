package egovframework.gonggam.book.adm.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm")
public class AdminLoanBookController {


	@GetMapping("/findAllLoanInfo.do") //	도서 대출 이력 조회(관리자)
	public String adminFindAllLoanInfo() {
		return null;
	}
	@GetMapping("/returnCheck.do") //	도서 반납 확인 처리(관리자)
	public String adminReturnCheck() {
		return null;
	}
	@GetMapping("/cancelReturnCheck.do") //	도서 반납 취소 처리(관리자)
	public String adminCancelReturnCheck() {
		return null;
	}
}
