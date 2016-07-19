package com.niit.MyShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.User;
import com.niit.MyShop.model.Category;
public class UserTest {

		static AnnotationConfigApplicationContext context;
		
		public UserTest(){
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.MyShop");
			context.refresh();
		}
		
	public static void createUser(User user){
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		userDAO.saveOrUpdate(user);
	}
	public static void main(String[] args)
	{
		UserTest t  = new UserTest();
		User user = (User) context.getBean("user");
		
		user.setId("987");
		user.setUsername("Admin");
		user.setPassword("Admin");
		user.setAdmin(true);
		user.setAddress("Pune");
		user.setEmail("rohitgmail");
		user.setFname("rohit");
		user.setSname("mehta");
		user.setMob_no(927283738);
		t.createUser(user);
		
		user.setId("345");
		user.setUsername("Admin");
		user.setPassword("admin");
		user.setAdmin(true);
		user.setAddress("Mumbai");
		user.setEmail("rohitgmail");
		user.setFname("rohit");
		user.setSname("mehta");
		user.setMob_no(927283737);
		t.createUser(user);
	}
	
}
