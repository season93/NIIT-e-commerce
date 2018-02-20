package controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;


import com.google.gson.Gson;
import com.niit.eccomerse_backend.DAO.ProductDao;
import com.niit.eccomerse_backend.models.ProductModel;




@Controller
public class ProductController {

	 int editId;
	@Autowired
	ProductDao productdao;
	 @Bean
		public MultipartResolver multipartResolver() {
			CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
			multipartResolver.setMaxUploadSize(10240000);
			return multipartResolver;
		} 
 
	   @RequestMapping (value="AddProductPage")
	    public String addProductPage(Model model)
	    {
	    	ProductModel product= new ProductModel();
	    	model.addAttribute(("product"),product);
	    	
	    	return "AddProductPage";
	    }
	 @RequestMapping(value="ProductDetails",method=RequestMethod.POST)
	    public String addProduct(@ModelAttribute ("product") ProductModel product)
	    {
	        productdao.addProduct(product);
	        MultipartFile image=product.getImage();
	        System.out.println("season");
	        if (image != null && !image.isEmpty()) {
	        	System.out.println("hellow");
				Path path = Paths
						.get("C:\\Users\\DELL\\Desktop\\cddt\\ecommerce\\src\\main\\webapp\\resources\\images\\"
								+ product.getProductId() + ".jpg");

				try {
					image.transferTo(new File(path.toString()));
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        System.out.println("praneetha");
	    	return "AdminWelcomePage";
	    	
	    }
	   @RequestMapping(value="AllProductsList")
	   public String allProductList()
	   {
		  
		    return "ProductListPage";
	   }
	   @RequestMapping("List")
	   public @ResponseBody String list()
	   {
		    List<ProductModel> products= productdao.allProductList();
		    Gson g=new Gson();
		    String json=g.toJson(products);
		    return json;
		   
	   }
	  
	   @RequestMapping(value="DeleteProduct")
	   public String deleteProduct(@RequestParam int id)
	   {
		   productdao.deleteProduct(id);
		   return "AdminWelcomePage";
		  
		   
	   }
	   @RequestMapping(value="ToysProducts")
	   public String toysProducts()
	   {
		   
		   return "ToysProductsPage";
	   }
	   
	   @RequestMapping(value="ToysList")
	   public @ResponseBody String toysList()
	   {
		   List<ProductModel> toysproducts=productdao.toysList();
		   
		   Gson gson= new Gson();
		   String json=gson.toJson(toysproducts);
		   return json;
	   }
	   @RequestMapping(value="BooksProducts")
	   public String booksProducts()
	   {
		   
		   return "BooksProductsPage";
	   }
	   
	   @RequestMapping(value="BooksList")
	   public @ResponseBody String booksList()
	   {
		   List<ProductModel> booksproducts=productdao.booksList();
		   
		   Gson gson= new Gson();
		   String json=gson.toJson(booksproducts);
		   return json;
	   }
	   @RequestMapping(value="Mobile&LaptopsProducts")
	   public String mobile_LaptopsProducts()
	   {
		   
		   return "Mobile_LaptopsProductsPage";
	   }
	   
	   @RequestMapping(value="Mobile&LaptopsList")
	   public @ResponseBody String mobile_LaptopsList()
	   {
		   List<ProductModel> mobile_laptopsproducts=productdao.mobile_LaptopsList();
		   
		   Gson gson= new Gson();
		   String json=gson.toJson(mobile_laptopsproducts);
		   return json;
	   }
	 /* @RequestMapping(value="EditProduct")
	   public String editProduct(@RequestParam("id") int id)
	   {
		   //editId =id;
		   
		   return "EditProductPage";
	   }
	   @RequestMapping(value="Edit")
	   public @ResponseBody String edit()
	   {
		   List<ProductModel> product=productdao.editProduct(editId);
		   Gson gson= new Gson();
		   String json=gson.toJson(product);
		   return json;
	   }*/
	   @RequestMapping(value="EditProduct")
	   public String editProduct(@RequestParam("id")int id,Model model1)
	   {
		  ProductModel product=productdao.editProduct(id);
		   model1.addAttribute("product",product);
		   return  "EditProductPage";
	   }
	   @RequestMapping(value="update")
	   public String updateProduct(@RequestParam("id")int id,@ModelAttribute("product")ProductModel product)
	   {
		   productdao.updateproduct(product,id);
		   return "redirect:AdminWelcomePage";
	   }
	   
	  
	}

