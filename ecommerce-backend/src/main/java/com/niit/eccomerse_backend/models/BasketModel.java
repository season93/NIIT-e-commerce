package com.niit.eccomerse_backend.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Basket")
public class BasketModel {
	@Id
	@Column(name="basketId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int basketId;
	
	@OneToOne
	@JoinColumn(name="UserId")
	private UserModel user;
	
	@OneToMany(mappedBy="basket", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private List<CartItemModel> cartItems;

	public int getBasketId() {
		return basketId;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public List<CartItemModel> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItemModel> cartItems) {
		this.cartItems = cartItems;
	}
	
	
}

	
