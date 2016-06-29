package com.niit.MyShop.dao;


import java.util.List;

import com.niit.MyShop.model.User;
import com.niit.MyShop.model.UserDetails;
public interface UserDAO {
	public List<User> list();

	public User get(String id);

	public void saveOrUpdate(User user);
	public void saveOrUpdate(UserDetails userDetails);
	public void delete(String id);
	
	public boolean isValidUser(String name, String password, boolean isAdmin);

}





