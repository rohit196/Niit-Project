package com.niit.MyShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.User;
import com.niit.MyShop.model.Category;
public class UserTest {

	/*	static AnnotationConfigApplicationContext context;
		
		public UserTest(){
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.MyShop");
			context.refresh();
		}*/
		
/*	public static void createUser(User user){
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		userDAO.saveOrUpdate(user);
	}*/
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		
		/*UserTest t  = new UserTest();*/
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		User user = (User) context.getBean("user");
		
		user.setId(1555);
		user.setUsername("Abhay");
		user.setPassword("abhay");
		user.setAdmin(false);
		user.setAddress("Delhi");
		user.setEmail("abhay13gmail");
		user.setFname("abhay");
		user.setSname("Khanna");
		user.setMob_no(927283739);
		user.setEnabled(true);
		
		/*t.createUser(user);*/
		userDAO.saveorUpdate(user);
		
	/*	user.setId("345");
		user.setUsername("Admin");
		user.setPassword("admin");
		user.setAdmin(true);
		user.setAddress("Mumbai");
		user.setEmail("rohitgmail");
		user.setFname("rohit");
		user.setSname("mehta");
		user.setMob_no(927283737);
		t.createUser(user);*/
	}
	
}
