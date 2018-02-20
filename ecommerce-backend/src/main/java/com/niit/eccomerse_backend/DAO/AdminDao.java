package com.niit.eccomerse_backend.DAO;

import com.niit.eccomerse_backend.models.AdminModel;

public interface AdminDao {
	
	void addAdmin(AdminModel admin);
	boolean adminLogin(String adminname,String password);
      
}
