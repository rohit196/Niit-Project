package com.niit.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.UserDetails;
@Controller
public class UserController {
			
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/Login")
	public String getLogin()
	{
		return "Login";
	}
	/*@RequestMapping("/welcome")
	public String basic(){
		return "welcome";
	}*/
	@RequestMapping("/")
	public String getLanding()
	{
		System.out.println("Interface page called..");
		return "Interface";
	}
	@RequestMapping("/Success")
	public String getuser(){
		return "Success";
	}
	@RequestMapping("/AdminHome")
	public String getAdmin()
	{
		return "AdminHome";
	}
	@RequestMapping("/Interface")
	public String getHome()
	{
		return "Interface";
	}
	@RequestMapping("/contact")
	public String getContact()
	{
		return "contact";
	}
	@RequestMapping("/aboutus")
	public String geAboutUs()
	{
		return "aboutus";
	}
	@RequestMapping("/signup")
	public String getSignup()
	{
		return "signup";
	}
	@RequestMapping("/isValidUser")
	public ModelAndView isValidUser(@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password) {
		
		ModelAndView mv;
		System.out.println("in controller");

		String message;
		if(userDAO.isValidUser(name,password,true)){
			message = "Valid Credentials";
			mv = new ModelAndView("AdminHome");
			mv.addObject("message",message);
		}
		else
		{
			message = ("Invalid Credentiasl");
			mv = new ModelAndView("Login");
			mv.addObject("message",message);
		}
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;
		}
	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute UserDetails userDetails) {
		userDAO.saveOrUpdate(userDetails);
	  return new ModelAndView("/AdminHome");
	 }


}