package com.niit.eccomerse_backend.DAOimpl;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.eccomerse_backend.DAO.UserDao;
import com.niit.eccomerse_backend.models.UserModel;


//@Repository("UserDao")
public class UserDaoImpl implements UserDao {

	@Autowired(required=true)
    private SessionFactory sessionFactory;
	
	public UserDaoImpl() {}
     @Transactional
     public void addUser(UserModel user) {
    	  Session session =sessionFactory.getCurrentSession();
    	
	      session.save(user);
	     
	      //session.close();
	
     }
     public UserDaoImpl(SessionFactory sessionFactory)
     {
    	 this.sessionFactory=sessionFactory;
    	 
     }
     @Transactional 
     public UserModel findUser(String username) {
 		
 		Session session=sessionFactory.openSession();
 		Query query=session.createQuery("select * from userdetails where username="+username);
 		UserModel user=(UserModel)query.uniqueResult();
 		user.getGender();
 		return user;
 	}
}
