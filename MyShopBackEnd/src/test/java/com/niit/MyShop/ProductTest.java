package com.niit.MyShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

import com.niit.MyShop.dao.CategoryDAO;
import com.niit.MyShop.dao.ProductDAO;
import com.niit.MyShop.dao.SupplierDAO;
import com.niit.MyShop.model.Category;
import com.niit.MyShop.model.Product;
import com.niit.MyShop.model.Supplier;


public class ProductTest {
	
	public static void main(String[] args) {
			
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		
		
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
			
		Product product = (Product)context.getBean("product");
		
		SupplierDAO supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		
		Supplier supplier = (Supplier)context.getBean("supplier");
		
		CategoryDAO categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		Category category = (Category)context.getBean("category");
		
		
		

		product.setId("1");
		product.setName("Titan");
		product.setDescription("Mens Watch");
		product.setPrice(5000.0);
		category= categoryDAO.get("1000");
		category.setId("1000");
		
		product.setCategory(category);
		supplier= supplierDAO.get("101");
		product.setSupplier(supplier);
		
		
		System.out.println(product.getCategory().getName()+" from product");
		productDAO.saveOrUpdate(product);
		
		
	}

}
