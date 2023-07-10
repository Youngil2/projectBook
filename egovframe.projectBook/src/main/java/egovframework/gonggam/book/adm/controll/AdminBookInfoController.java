package egovframework.gonggam.book.adm.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm")
public class AdminBookInfoController {

	@GetMapping("/addBookInfo.do")//	도서 정보 등록(관리자)
	public String adminAddBookInfo() {
		return "book.adm.book_info_regist_form";
	}
	@GetMapping("/modifyBookInfo.do")//	도서 정보 수정(관리자)
	public String adminModifyBookInfo() {
		return null;
	}
	@GetMapping("/removeBookInfo.do")//	도서 정보 삭제(관리자)
	public String adminRemoveBookInfoadm() {
		return null;
	}
}
