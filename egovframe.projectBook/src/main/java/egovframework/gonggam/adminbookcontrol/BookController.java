package egovframework.gonggam.adminbookcontrol;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.stringtemplate.v4.ModelAdaptor;

@Controller
@RequestMapping("/admin")
public class BookController {
	
	
	
	@RequestMapping("/booklist.do")
	public ModelAndView booklist() {
		ModelAndView mv = new  ModelAndView("admin.book.booklist");
		return mv;
	}
	
	@RequestMapping("/bookloan.do")
	public ModelAndView loan() {
		ModelAndView mv = new  ModelAndView("admin.book.bookloan");
		return mv;
	}

}
