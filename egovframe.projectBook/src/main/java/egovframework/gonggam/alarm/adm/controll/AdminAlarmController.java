package egovframework.gonggam.alarm.adm.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm")
public class AdminAlarmController {


	
	@GetMapping("/sendAlarm.do") //  알람 보내기(관리자)
	public String adminSendAlarm() {
		return null;
	}
	
	@GetMapping("/findAllAlarmInfo.do") //  알람 이력 조회(관리자)
	public String adminFindAllAlarmInfo() {
		return null;
	}
}
