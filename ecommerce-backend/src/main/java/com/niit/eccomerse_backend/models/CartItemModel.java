package com.niit.eccomerse_backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CartItem ")
public class CartItemModel 
{
	
	@Id
	@Column(name="cartItemId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartItemId;
	
	private double price;
	
	@ManyToOne
	private ProductModel product;
	
	@ManyToOne
	private BasketModel basket;

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductModel getProduct() {
		return product;
	}

	public void setProduct(ProductModel product) {
		this.product = product;
	}

	public BasketModel getBasket() {
		return basket;
	}

	public void setBasket(BasketModel basket) {
		this.basket = basket;
	}
  
	 
}
