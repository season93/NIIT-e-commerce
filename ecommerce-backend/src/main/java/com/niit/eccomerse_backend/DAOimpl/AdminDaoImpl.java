package com.niit.eccomerse_backend.DAOimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.eccomerse_backend.DAO.AdminDao;
import com.niit.eccomerse_backend.models.AdminModel;



public class AdminDaoImpl implements AdminDao {
   
	@Autowired
	private SessionFactory sessionFactory;
	
	public AdminDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
  
    

	@Transactional
     public void addAdmin(AdminModel admin) {
		
    	 Session session= sessionFactory.getCurrentSession();
    	
    	 session.save(admin);
    	
    	

	}
	
	@Transactional
	public boolean adminLogin(String adminname, String password) {
		
		Session session= sessionFactory.getCurrentSession();
		int count=0;
		Criteria criteria=session.createCriteria(AdminModel.class);
		List<AdminModel> admindetails= criteria.list();
		for(AdminModel admin1:admindetails)
		{
			String admin2=admin1.getAdminname();
			if(admin2==adminname)
			{
				String pass=admin1.getPassword();
				if(pass==password)
				count=1;
				break;
			}
		}
		System.out.println(count);
		if(count==0)
			return false;
		else
			return true;
		
	}
}
