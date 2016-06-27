/*package com.niit.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.MyShop.dao.UserDAO;

@Controller
public class UserController {
		
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/isValidUser")
	public ModelAndView isValidUser(@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");

		String message;
		ModelAndView mv ;
		if (userDAO.isValidUser(name, password, false)) 
		{
			message = "Valid credentials";
			 mv = new ModelAndView("AdminHome");
		} else {
			message = "Invalid credentials";
			 mv = new ModelAndView("Login");
		}

		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	/*@RequestMapping("/Login")
	public String displayHome(){
		return ("/AdminHome");
	 }
}*/
	
