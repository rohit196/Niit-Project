package com.niit.MyShop.dao;


import java.util.List;


/*import com.niit.MyShop.model.Signup_Details;*/
import com.niit.MyShop.model.User;
import com.niit.MyShop.model.UserDetails;
public interface UserDAO {
	public List<User> list();

	public User get(String id);

	public void saveOrUpdate(User user);
	public void saveOrUpdate(UserDetails userDetails);
	/*public void saveOrUpdate(Signup_Details signup_Details);*/
	public void delete(String id);
	
	public boolean isValidUser(String id, String password, boolean isAdmin);

}





