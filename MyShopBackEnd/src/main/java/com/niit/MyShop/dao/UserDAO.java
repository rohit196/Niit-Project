package com.niit.MyShop.dao;


import java.util.List;

import com.niit.MyShop.model.User;
public interface UserDAO {
	public List<User> list();

	public User get(String id);

	public void saveOrUpdate(User user);

	public void delete(String id);
	
	public boolean isValidUser(String id, String name, boolean isAdmin);

}





