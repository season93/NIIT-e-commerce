package com.niit.eccomerse_backend.DAOimpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.eccomerse_backend.DAO.CartItemDao;
import com.niit.eccomerse_backend.models.BasketModel;
import com.niit.eccomerse_backend.models.CartItemModel;

public class CartItemDaoImpl implements CartItemDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public CartItemDaoImpl(SessionFactory sessionFactory)
	{
		
		this.sessionFactory=sessionFactory;
	}
	@Transactional 
	public void saveCartItem(CartItemModel cart) {
		 Session session = sessionFactory.openSession();
		 session.saveOrUpdate(cart);
		
	}
	@Transactional 
	public void deleteCartItem(int id) {
		
		Session session= sessionFactory.openSession();
		CartItemModel cartItem=(CartItemModel)session.load(CartItemModel.class, id);
		session.delete(cartItem);
	}
	@Transactional 
	public void deleteAllCartItems(int id) {
		Session session=sessionFactory.openSession();
		BasketModel basket =(BasketModel)session.load(BasketModel.class, id);
		session.delete(basket);
	}
}
