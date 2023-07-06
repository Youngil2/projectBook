package egovframework.gonggam.member.book_info.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class booklistController {
	
	@GetMapping("/booklist.do")
	public String booklist() {
		return "member.book.booklist";
	}

}
