	package com.org.MyShop;

	

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;



	@Controller
	public class LoginController {
	
	//	private LoginService loginService;
	
		@RequestMapping("/Login")
		public ModelAndView showLoginController(){
			System.out.println("from login controller");
			return new ModelAndView("Login");
			
		}
		/*@RequestMapping("isValidContrller")
		public ModelAndView isValidUser(String userName, String password){
			return null;
			
		}*/
		
	
	}