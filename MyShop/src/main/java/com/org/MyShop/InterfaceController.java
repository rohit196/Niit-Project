package com.org.MyShop;

//import org.apache.catalina.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


 @Controller
public class InterfaceController {
	 
	 	 
	 @RequestMapping("/")
	 public ModelAndView showInterfacePage(){
		 System.out.println("From controller");
		 return new ModelAndView("Interface");
	 }
	 
	

}


