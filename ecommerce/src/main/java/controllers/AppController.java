package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	public AppController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/")
	public ModelAndView showHome()
    {
		
		ModelAndView mv=new ModelAndView("index");
		return mv;
		
	}
	@RequestMapping(value="ContactUs")
	public String contact()
	{
		return "ContactUs";
	}
	@RequestMapping(value="AboutUs")
	public String about()
	{
		return "AboutUs";
	}
	@RequestMapping(value="Home")
	public String home()
	{
		return "index";
	}

}
