/*package com.niit.MyShop;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.servlet.ModelAndView;

	import com.niit.MyShop.dao.LoginDAO;

	@Controller
	public class LoginController {
		
		@Autowired
		LoginDAO loginDAO;
		
		@RequestMapping("/Login")
		String showLoginController(){
			System.out.println("in Login");
			return "Login";
		}
		@RequestMapping("/Signup")
		String showsignup(){
			System.out.println("in signup");
			return "signup";
		}
		@RequestMapping("/isValidUser")
		public ModelAndView isValidUser(@RequestParam(value = "name") String name,
				@RequestParam(value = "password") String password) {
			
			ModelAndView mv;
			System.out.println("in controller");

			String message;
			if(loginDAO.isValidUser(name,password)){
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
	}

*/