package egovframework.gonggam.user.adm.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm")
public class AdminMbrInfoController {

	@GetMapping("/getMbrList.do") //	회원 목록 조회(관리자)
	public String adminGetMbrList() { 
		return null;
	}
	@GetMapping("/getMbrInfo.do") //	회원 정보 조회(관리자)
	public String adminGetMbrInfo() { 
		return null;
	}
	@GetMapping("/modifyMbrInfo.do") //	회원 정보 수정(관리자)
	public String adminModifyMbrInfo() { 
		return null;
	}
	@GetMapping("/removeMbrInfo.do") //	회원 삭제(관리자)
	public String adminRemoveMbrInfo() { 
		return null;
	}
}
