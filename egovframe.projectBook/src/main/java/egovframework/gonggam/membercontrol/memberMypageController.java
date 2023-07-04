package egovframework.gonggam.membercontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class memberMypageController {
	
	@GetMapping("/mypage.do")
	public String mypage() {
		return "member.mypage.mystatus";
	}

}
