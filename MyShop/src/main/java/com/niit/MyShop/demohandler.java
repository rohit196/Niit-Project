package com.niit.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.User;

@Component
public class demohandler {
	
	 @Autowired
	 User user;
	 @Autowired
	 UserDAO userDAO;
	 
		public User initFlow(){
			return new User();
		}
	 
		public String validateDetails(User user,MessageContext messageContext){
			String status = "success";
			if(user.getFname().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"fname").defaultText("fname cannot be Empty").build());
				status = "failure";
			}
			if(user.getSname().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source("sname").defaultText("Sname cannot be empty").build());
				status = "failure";
			}
			if(user.getEmail().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"email").defaultText("Email cannot be Empty").build());
				status = "failure";
			}
			if(user.getPassword()==null){
				messageContext.addMessage(new MessageBuilder().error().source(
						"password").defaultText("password cannot be Empty").build());
				status = "failure";
			}
			return status;
		}
		
		@RequestMapping(method=RequestMethod.POST ,value="/Signup")
		public String getSignup(User user ,MessageContext messagecontext)
		{
			
				
			
			System.out.println("in signup controller");
	/*		System.out.println("id"+id);*/
			
			user.setEnabled(true);
			userDAO.saveorUpdate(user);
			
			System.out.println("user saved");
		
			return "Interface";
			}
		}
