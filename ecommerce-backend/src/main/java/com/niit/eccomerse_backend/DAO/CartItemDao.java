package com.niit.eccomerse_backend.DAO;

import com.niit.eccomerse_backend.models.CartItemModel;

public interface CartItemDao {

	void saveCartItem(CartItemModel cart);

	void deleteCartItem(int id);
	void deleteAllCartItems(int id);

}
