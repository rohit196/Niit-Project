/*package com.niit.MyShop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.MyShop.dao.UserDAO;

public class UserTestCase {

	UserDAO userDAO;
	
	@Before
	public void init(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	
	
	public void isValidUser() {
		//System.out.println(userDAO.));
	System.out.println(userDAO.isValidUser("123", "Admin", true));
	 assertEquals("Validate True", true, userDAO.isValidUser("123", "Admin", true));
	}
	
	
	public void getTest()
	{
		System.out.println(userDAO.get("123"));
		assertEquals("ID confirmed","Admin" ,userDAO.get("123").getUsername());
	}
	
}
*/