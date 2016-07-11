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
			
		System.out.println("In Main");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		
		
/*		Product p = (Product) context.getBean("product");
		
		p.setId("200");
		p.setName("Titan");
		p.setDescription("Mens Watch");
		p.setPrice(5000.0);
		
		p.setSupplier_fk("2001");
		p.getCategory_fk("1000");*/
		
		
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
			
		Product product = (Product)context.getBean("product");
		
		SupplierDAO supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		
		Supplier supplier = (Supplier)context.getBean("supplier");
		
		CategoryDAO categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		Category category = (Category)context.getBean("category");
		
		System.out.println("#########Before Update");
		product.setId("20");
		product.setName("Titan");
		product.setDescription("Mens Watch");
		product.setPrice(5000.0);
		category= categoryDAO.get("1001");
		System.out.println("@@@@@@@"+category.getCat_id());
		product.setCategory_fk(category);
		supplier= supplierDAO.get("s123");
		System.out.println("supplier: "+ supplier.getSid());
		product.setSupplier_fk(supplier);
		System.out.println(product.getCategory_fk().getDescription()+" from product");
		//productDAO.saveOrUpdate(product);
		productDAO.saveOrUpdate(product);
/*		
		product.setId("3");
		product.setName("Titan");
		product.setDescription("Women Watch");
		product.setPrice(5000.0);
		category= categoryDAO.get("1001");
		product.setCategory_fk(category);
		supplier= supplierDAO.get("1004");
		System.out.println("supplier: "+ supplier.getName());
		product.setSupplier_fk(supplier);
		System.out.println(product.getCategory_fk().getDescription()+" from product");
		productDAO.saveOrUpdate(product);*/
	}

}
