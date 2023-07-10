package egovframework.gonggam.user.mbr.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbr")
public class MbrController {

	@GetMapping("/addNewMbr.do") //	회원 등록(회원)
	public String addNewMbr() {
		return null;
	}
	
	@GetMapping("/confirmID.do")  //	회원 아이디 중복 조회(회원)
	public String confirmIDDuplication() {
		return null;
	}

}
