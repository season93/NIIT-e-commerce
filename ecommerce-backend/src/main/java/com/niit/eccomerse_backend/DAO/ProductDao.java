package com.niit.eccomerse_backend.DAO;

import java.util.List;

import com.niit.eccomerse_backend.models.ProductModel;



public interface ProductDao {
   
	void addProduct(ProductModel product);
	List<ProductModel> allProductList();
	void deleteProduct(int id);
	List<ProductModel> toysList();
	List<ProductModel> booksList();
	List<ProductModel> mobile_LaptopsList();
	ProductModel editProduct(int id);
	void updateproduct(ProductModel product, int id);
	ProductModel getProduct(int id);
}
