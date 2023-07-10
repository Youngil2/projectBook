package egovframework.gonggam.user.mbr.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbr")
public class MbrInfoController {	

	@GetMapping("/modifyMbrInfo.do")//	회원 정보 수정(회원)
	public String modifyMbrInfo() {
		return null;
	}
	@GetMapping("/getMbrInfo.do")//	회원 정보 조회(회원)
	public String getMbrInfo() {
		return null;
	}
	@GetMapping("removeMbrInfo.do")//	회원 탈퇴(회원)	
	public String removeMbrInfo() {
		return null;
	}
}
