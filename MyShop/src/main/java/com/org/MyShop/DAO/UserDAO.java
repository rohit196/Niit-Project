package com.org.MyShop.DAO;
import org.springframework.stereotype.*;

@Repository
public class UserDAO {
	
	public boolean isValidUser(String userName, String password)
	{
		if(userName.equals("NIIT") && password.equals("NIIT@123"))
		{
			return true;
		}
		else{
				return false;
		}
	}
	
}
