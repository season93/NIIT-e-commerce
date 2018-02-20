package com.niit.eccomerse_backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.niit.eccomerse_backend.DAO.AdminDao;
import com.niit.eccomerse_backend.DAO.CartItemDao;
import com.niit.eccomerse_backend.DAO.ProductDao;
import com.niit.eccomerse_backend.DAO.UserDao;
import com.niit.eccomerse_backend.DAOimpl.AdminDaoImpl;
import com.niit.eccomerse_backend.DAOimpl.CartItemDaoImpl;
import com.niit.eccomerse_backend.DAOimpl.ProductDaoImpl;
import com.niit.eccomerse_backend.DAOimpl.UserDaoImpl;
import com.niit.eccomerse_backend.models.AdminModel;
import com.niit.eccomerse_backend.models.BasketModel;
import com.niit.eccomerse_backend.models.CartItemModel;

import com.niit.eccomerse_backend.models.UserModel;




@Configuration
@EnableTransactionManagement

public class HibernateConfig {
	
	@Autowired
    @Bean
    public SessionFactory sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBuilder sessionBuilder  = new LocalSessionFactoryBuilder(dataSource);
        /*sessionBuilder.setProperty("hibernate.show_sql", "true");*/
        
        sessionBuilder.addProperties(getHibernateProperties());
       
        
        sessionBuilder.addAnnotatedClass(com.niit.eccomerse_backend.models.ProductModel.class);
        sessionBuilder.addAnnotatedClass(UserModel.class);
        sessionBuilder.addAnnotatedClass(AdminModel.class);
        sessionBuilder.addAnnotatedClass(CartItemModel.class);
        sessionBuilder.addAnnotatedClass(BasketModel.class);
        
  	    return sessionBuilder.buildSessionFactory();
    }
	 @Autowired
	    @Bean(name = "datasource")
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("org.h2.Driver");
	        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");

	        dataSource.setUsername("sa");
	        dataSource.setPassword("");
	        System.out.println("Data Source Created.....");
	        return dataSource;
	       
	        }
	
	private Properties getHibernateProperties() {
		
		 Properties properties = new Properties();
	        properties.put("hibernate.show_sql", "true");
	        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	        properties.put("hibernate.format_sql", "true");
	        properties.put("hibernate.hbm2ddl.auto", "update");
	        properties.put("hibernate.connection.autocommit", true);
	        //properties.put("hibernate.temp.use_jdbc_metadata_defaults",false);
	        return properties;
	}
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(10240000);
		return multipartResolver;
	} 


    @Bean
	@Autowired
        public HibernateTransactionManager txManager(SessionFactory sessionFactory) {
                return new HibernateTransactionManager(sessionFactory);
        }
    
     @Bean
     @Autowired
     public UserDao getUserDao(SessionFactory sessionFactory)
     {
    	 
    	 return new UserDaoImpl(sessionFactory);
     }

     @Bean
     @Autowired
     public AdminDao getAdminDao(SessionFactory sessionFactory)
     {
    	 
    	 return new AdminDaoImpl(sessionFactory);
     }

     @Bean
     @Autowired
     public ProductDao getProductDao(SessionFactory sessionFactory)
     {
    	 
    	 return new ProductDaoImpl(sessionFactory);
     }
     @Bean
     @Autowired
     public CartItemDao getCartdao(SessionFactory sessionFactory)
     {
    	 
    	 return new CartItemDaoImpl(sessionFactory);
     }
    
		public HibernateConfig() 
	{}

}
