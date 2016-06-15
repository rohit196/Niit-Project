package com.niit.ShoppingCart.test;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.ShoppingCart.bean");
		context.refresh();
			
		try {
			context.getBean("category");
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
