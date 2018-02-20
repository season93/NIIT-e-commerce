package controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.eccomerse_backend.DAO.UserDao;
import com.niit.eccomerse_backend.DAOimpl.UserDaoImpl;
import com.niit.eccomerse_backend.models.UserModel;

@Controller
public class UserController {
   @Autowired(required=true)
	private UserDao userdao ;
	@RequestMapping("NewUser")
	public String welcome(Model model)
	{
		
		UserModel user= new UserModel();
		model.addAttribute("user",user);
		
		return "SighnUpPage";
	}
	@RequestMapping(value="Login")
	public String loginPage()
	{
		  return "LoginPage";
		
	}
	@RequestMapping(value="Profile")
	public String profilePage()
	{
		  return "ProfilePage";
		
	}
	@RequestMapping(value="WelcomePage")
	public String welcomePage1()
	{
		return "WelcomePage";
	}
	@RequestMapping(value="LoginFailed")
	public String loginFailed()
	{
		return "LoginPage";
	}
	@RequestMapping(value ="WelcomeUser",method=RequestMethod.POST)
	public ModelAndView Welcome(@ModelAttribute ("user")UserModel user)
	{
       ModelAndView modelandview=new ModelAndView();       
       userdao.addUser(user);
      
       modelandview.setViewName("WelcomePage");
       
	   return modelandview;	
	}
  
	/*(value="/WelcomePage")
	public String welcomePage()
	{
		
	return "WelcomePage";
	}*/
	
	
}
