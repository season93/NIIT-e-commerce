package com.niit.eccomerse_backend.DAO;

import java.util.List;

import com.niit.eccomerse_backend.models.ProductModel;

public interface BasketDao {
	
	void addToCart(String name,int pid);

	List<ProductModel> openBasket();

}
