/*package com.niit.MyShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.Signup_Details;

public class Signuptest {
	
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		Signup_Details signup_details = (Signup_Details) context.getBean("signup_Details");
		
		signup_details.setCountry("India");
		signup_details.setEmail("harry123");
		signup_details.setFname("Harry");
		signup_details.setId("123");
		signup_details.setSname("mehta");
		
		userDAO.saveOrUpdate(signup_details);
	}
	

}
*/