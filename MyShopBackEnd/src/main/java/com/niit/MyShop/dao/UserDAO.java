package com.niit.MyShop.dao;


import java.util.List;


/*import com.niit.MyShop.model.Signup_Details;*/
import com.niit.MyShop.model.User;
import com.niit.MyShop.model.UserDetails;
public interface UserDAO {
	public List<User> list();

	public User get(int id);
	
	public User getUser(String email);
	/*public void saveOrUpdate(User user);*/
	public void saveorUpdate(User user);
	public void saveOrUpdate(UserDetails userDetails);
	/*public void saveOrUpdate(Signup_Details signup_Details);*/
	public void delete(int id);
	public void enable(int id ,boolean enabled);
	
	public void isValidUser(String email, String password);

}





