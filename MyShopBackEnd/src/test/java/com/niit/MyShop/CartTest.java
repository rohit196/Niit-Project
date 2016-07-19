package com.niit.MyShop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.MyShop.dao.*;
import com.niit.MyShop.model.*;
import com.niit.MyShop.dao.CartDetailsDAO;
/*import com.niit.MyShop.dao.CartDetailsDAO;
import com.niit.MyShop.dao.CategoryDAO;
import com.niit.MyShop.dao.SupplierDAO;
import com.niit.MyShop.dao.ProductDAO;
import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.CartDetails;
import com.niit.MyShop.model.Category;
import com.niit.MyShop.model.Product;
import com.niit.MyShop.model.Supplier;
import com.niit.MyShop.model.User;*/

public class CartTest {

	public static void main(String[] args ){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		
	CartDetailsDAO cart = (CartDetailsDAO) context.getBean("cartDetailsDAO");
	CartDetails cartDetails = (CartDetails) context.getBean("cartDetails");
	CartDetails cartDetails2 = (CartDetails) context.getBean("cartDetails");	
	
		Product p = (Product) context.getBean("product");
		ProductDAO  pdao = (ProductDAO) context.getBean("productDAO");
		
		UserDAO uDao = (UserDAO) context.getBean("userDAO");
		User u  = (User) context.getBean("user");
		
/*		CartDetails cartDetails = new CartDetails();
		cartDetails.setCartid("1");
		u = uDao.get("123");
		cartDetails.setUser_fk(u);
		p = pdao.get("20");
		cartDetails.setProduct_fk(p);
		cartDetails.setCategory_fk(p.getCategory_fk());
		cartDetails.setSupplier_fk(p.getSupplier_fk());
		cartDetails.setPrice(p.getPrice());
		cartDetails.setQty("1");
		cartDetails.setPrice(5000.0);
		List<CartDetails> cartList = new ArrayList<CartDetails>();
		cartList.add(cartDetails);
		
		cart.save(cartDetails);
		
		cartDetails2.setCartid("2");
		u = uDao.get("456");
		cartDetails.setUser_fk(u);
		p = pdao.get("22");
		cartDetails2.setProduct_fk(p);
		cartDetails2.setCategory_fk(p.getCategory_fk());
		cartDetails2.setSupplier_fk(p.getSupplier_fk());
		cartDetails2.setPrice(p.getPrice());
		cartDetails2.setQty("5");
		cartDetails2.setPrice(9000.0);
		List<CartDetails> cartList = new ArrayList<CartDetails>();
		
		cartList.add(cartDetails2);
		
		cart.save(cartDetails2);
		
		System.out.println("before save");
		uDao.saveOrUpdate(u);*/
		cart.delete("123", "20", "1001", "s123");
		/*cart.update("123", "20", "1000", null,"4");*/
		
	}
}
