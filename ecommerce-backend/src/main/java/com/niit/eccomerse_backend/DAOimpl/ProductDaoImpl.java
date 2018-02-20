package com.niit.eccomerse_backend.DAOimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.eccomerse_backend.DAO.ProductDao;
import com.niit.eccomerse_backend.models.ProductModel;


//@Repository(value="ProductDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
    

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public void addProduct(ProductModel product) {
		 Session session=sessionFactory.getCurrentSession();
		
         session.saveOrUpdate(product);
   	}
	@Transactional
	public List<ProductModel> allProductList()
	{
		Session session= sessionFactory.getCurrentSession();
				List<ProductModel> product= session.createCriteria(ProductModel.class).list();
				return product;
		
	}
	@Transactional
	public void deleteProduct(int id)
	{
		Session session=sessionFactory.openSession();
		ProductModel product=session.load(ProductModel.class, new Integer(id));
		session.delete(product);
		
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<ProductModel> toysList()
	{
		   
		  Session session= sessionFactory.openSession();
		  Criteria cri=session.createCriteria(ProductModel.class);
		  cri.add(Restrictions.eq("categorytype", "Toys"));
		 List<ProductModel> toysproduct=cri.list();
		 
		   return toysproduct;
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<ProductModel> booksList()
	{
		Session session= sessionFactory.openSession();
		Criteria cri=session.createCriteria(ProductModel.class);
		cri.add(Restrictions.eq("categorytype","Books"));
		List<ProductModel> bookslist=cri.list();
		
		return bookslist;
	}
	
	
	@SuppressWarnings("unchecked")
	@Transactional 
	public List<ProductModel> mobile_LaptopsList()
	{
		
		  Session session= sessionFactory.openSession();
		  Criteria cri=session.createCriteria(ProductModel.class);
		  cri.add(Restrictions.eq("categorytype", "Laptops"));
		 List<ProductModel> mobiles_laptopsproduct=cri.list();
		 
		   return mobiles_laptopsproduct;
}


	@Transactional 
	public ProductModel editProduct(int id) {
		Session session= sessionFactory.openSession();
		ProductModel product=(ProductModel)session.load(ProductModel.class, id);
		
		return product;
	}
	

	public ProductDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional 

	public void updateproduct(ProductModel product,int id) {
	     
		Session session=sessionFactory.getCurrentSession();
		ProductModel product1=(ProductModel)session.load(ProductModel.class, id);
		product1=product;
		session.update(product1);
		
	}
	@Transactional 
       public ProductModel getProduct(int id) {
		
		Session session=sessionFactory.openSession();
		ProductModel product=(ProductModel)session.load(ProductModel.class,id);
		return product;
				
	}
}