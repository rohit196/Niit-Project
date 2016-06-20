package com.org.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.MyShop.DAO.UserDAO;

@Controller
public class IsValidController {

	@Autowired
	UserDAO userDAO;
	@RequestMapping("isValidUser")
	public ModelAndView showMessage(@RequestParam(value="name") String name,
			@RequestParam(value="password")String password){
		
		ModelAndView mv;
		System.out.println("in controller");
		String message;
		if(userDAO.isValidUser(name, password)){
			System.out.println("validate true");
			message = "Valid credentials";
			mv = new ModelAndView("AdminHome");
		}
		else{
			message = "invalid credentials";
			mv = new ModelAndView("Login");
			
		}
		mv.addObject("message",message);
		mv.addObject("name",name);
		//mv.addObject("password",password);
		return mv; 
	}
	
}
