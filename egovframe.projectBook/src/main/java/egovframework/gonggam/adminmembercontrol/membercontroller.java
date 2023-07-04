package egovframework.gonggam.adminmembercontrol;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class membercontroller {
	
	@RequestMapping("/memberlist.do")
	public String memberlist() {
		return "admin.member.memberlist";
	}

}
