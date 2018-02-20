package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.eccomerse_backend.DAO.UserDao;
import com.niit.eccomerse_backend.models.BasketModel;
import com.niit.eccomerse_backend.models.CartItemModel;
import com.niit.eccomerse_backend.models.ProductModel;
import com.niit.eccomerse_backend.models.UserModel;

@Controller
public class BasketController {
	@Autowired
    UserDao userdao;

	@RequestMapping(value="OpenBasket")
	public ModelAndView openBasket()
	{
		User user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username=user.getUsername();
		UserModel usermodel=userdao.findUser(username);
		BasketModel basket=usermodel.getBasket();
		List<CartItemModel> cartitems=basket.getCartItems();
		
		return new ModelAndView("BasketPage","cartitems",cartitems);
	}

}
