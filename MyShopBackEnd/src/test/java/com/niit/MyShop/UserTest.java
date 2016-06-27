package com.niit.MyShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.User;
import com.niit.MyShop.model.Category;
public class UserTest {

		static AnnotationConfigApplicationContext context;
		
		/*public UserTest()
		{
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.MyShop");
			context.refresh();
		
		}*/
		
		/*public static void createUser(User user)
		{
			
			UserDAO  userDAO =  (UserDAO) context.getBean("userDAO");
			userDAO.saveOrUpdate(user);
			
			
		}*/
		public static void main(String[] args) {
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.MyShop");
			context.refresh();

			//UserTest t = new UserTest();
			
			UserDAO userDAO = (UserDAO)  context.getBean("userDAO");
			User user = (User)  context.getBean("user");
			user.setId("1");
			user.setUsername("NIIT");
			user.setPassword("NIIT");
			user.setAdmin(true);
			
			/*UserDAO  userDAO1 =  (UserDAO) context.getBean("userDAO");
		if(userDAO1.isValidUser("NIIT","NIIT",true)){
			System.out.println("Valid User");
		}*/
		//	userDAO.saveOrUpdate(user);
			
			
		}
		
		
}
