package egovframework.gonggam.admin.book_info.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.gonggam.admin.book_info.service.BookService;


@Controller
@RequestMapping("/admin")
public class BookInfoController {
	
	@Autowired
	BookService bs;
	
//도서목록조회
	@GetMapping("/findAllBookInfo.do")
	public String findAllBookInfo() {
		return "admin.book.book_list";
	}

//도서 상세정보조회
	@GetMapping("/findBookDetailInfo.do")
	public String findBookDetailInfo() {
		return "admin.book.book_detail_info";
	}
	
//도서등록
	@GetMapping("/addBookInfo.do")
	public String bookregist() {
		return "admin.book.book_info_regist";
	}
	@PostMapping("/addBookInfo.do")
	public String adminAddBookInfo(@RequestParam Map<String,Object> map) {
		String bookid = this.bs.create(map);
		if(bookid == null) {
		return "admin.book.book_info_regist";
		}else {
			return "admin.book.book_list";
		}
	}
	
//도서 수정
	@GetMapping("/modifyBookInfo.do")
	public String adminModifyBookInfo() {
		return "admin.book.book_info_update";
	}
//도서삭제
	@GetMapping("/removeBookInfo")
	public String adminRemoveBookInfo() {
		return "admin.book.book_list";
	}

}
