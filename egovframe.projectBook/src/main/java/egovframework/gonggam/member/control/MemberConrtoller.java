package egovframework.gonggam.member.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberConrtoller {

	@GetMapping("/create.do")
	public String create() {
		return "member/regist/mbr_form";
	}
}
