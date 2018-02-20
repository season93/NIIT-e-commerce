package com.niit.eccomerse_backend.DAO;

import com.niit.eccomerse_backend.models.UserModel;

public interface UserDao {

	void addUser(UserModel user);
	UserModel findUser(String username);
}
