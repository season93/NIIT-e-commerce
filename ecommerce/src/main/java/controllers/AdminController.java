package controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.eccomerse_backend.DAO.AdminDao;
import com.niit.eccomerse_backend.DAOimpl.AdminDaoImpl;
import com.niit.eccomerse_backend.models.AdminModel;

@Controller
public class AdminController {
	@Autowired
	private AdminDao adminDao;
	
	@RequestMapping (value="/Admin")
	public String admin()
	{
		return "AdminPage";
	}
	
	@RequestMapping (value="AdminSighnupPage")
	public String adminsighnup(Model model)
	{
		AdminModel admin=new AdminModel();
		model.addAttribute("admin",admin);
		return "AdminSighnupPage";		
	}
	
	@RequestMapping (value="AdminLogin", method=RequestMethod.POST)
	public String adminwelcome(@ModelAttribute ("admin") AdminModel admin)
	{		
		adminDao.addAdmin(admin);
		
		
		return "AdminWelcomePage";
		
	}
	@RequestMapping(name="season",method=RequestMethod.POST)
	public String adminLogin(@PathVariable("adminname")String adminame,@PathVariable("password")String password)
	{
		System.out.println("hello");
		boolean b=adminDao.adminLogin(adminame, password);
		System.out.println(b);
		if(b==true)
		return "AdminWelcomePage";
		else
		return "redirect:AdminPage";
	}
	
	
}