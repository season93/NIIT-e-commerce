package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.eccomerse_backend.DAO.CartItemDao;
import com.niit.eccomerse_backend.DAO.ProductDao;
import com.niit.eccomerse_backend.DAO.UserDao;
import com.niit.eccomerse_backend.models.BasketModel;
import com.niit.eccomerse_backend.models.CartItemModel;
import com.niit.eccomerse_backend.models.ProductModel;
import com.niit.eccomerse_backend.models.UserModel;

@Controller
public class CartItemController {
	
  @Autowired
  private UserDao userdao;
  
  @Autowired 
  private ProductDao productdao;
  
  @Autowired
  CartItemDao cartdao;
  
	@RequestMapping(value="AddToCart")
	public void addToCart(@RequestParam("id")int productId)
	{
		 System.out.println("check 1");
	   User user=(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	   //System.out.println("check 2");
	   String username=user.getUsername();
	 //  System.out.println("check 2");
	   UserModel usermodel=userdao.findUser(username);
	  // System.out.println(usermodel.getGender());
	   BasketModel basket=usermodel.getBasket();
	   List<CartItemModel> cartmodel=basket.getCartItems();
	   ProductModel product=productdao.getProduct(productId);
	   CartItemModel cart=new CartItemModel();
	   cart.setBasket(basket);
	   cart.setProduct(product);
	   cart.setPrice(Integer.parseInt(product.getPrice()));
	   
	   cartdao.saveCartItem(cart);
	}
	@RequestMapping(value="DeleteCartItem")
	public String delete(@RequestParam("cartItemId")int id)
	{
	    	 cartdao.deleteCartItem(id);
		return "basket ";
	}
	@RequestMapping(value="DeleteAll")
	public String deleteAll(@RequestParam("cartId")int id)
	{
		 cartdao.deleteAllCartItems(id);
		return "welcomePage";
	}
}
