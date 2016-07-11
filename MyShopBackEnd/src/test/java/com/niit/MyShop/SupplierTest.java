package com.niit.MyShop;

//import java.util.Iterator;
import java.util.List;

//import org.hibernate.query.Query;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.MyShop.dao.SupplierDAO;
import com.niit.MyShop.model.Supplier;


public class SupplierTest {
	
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier = (Supplier) context.getBean("supplier");
		
		/*supplier.setId("1001");
		supplier.setName("Ethos");
		supplier.setAddress("Pune");*/
		
		supplier.setSid("1002");
		supplier.setName("helosssss");
		supplier.setAddress("Mumbai");
		supplierDAO.saveOrUpdate(supplier);
		
		supplier.setSid("1003");
		supplier.setName("hollaa");
		supplier.setAddress("Mumbai");		
		supplierDAO.saveOrUpdate(supplier);
		
		
		supplier.setSid("1004");
		supplier.setName("helo");
		supplier.setAddress("Chennai");			
		supplierDAO.saveOrUpdate(supplier);
		
		
		List<Supplier> list = supplierDAO.list();
		for(Supplier sup : list)
		{
			System.out.println(sup.getSid() + ":" + sup.getName() + ":" + sup.getAddress());
		}
		//Category c = categoryDao.get(1000);
		//System.out.println(c.getId());
		
		/*List<Supplier> sList = supplierDAO.list();
		Iterator i = (Iterator) sList.iterator();
		while(i.hasNext()){
			Supplier s = (Supplier) i.next();
			System.out.println(s.getAddress());
		}*/
		
		
		//System.out.println("in supplier");
	}
	 
		 //System.out.println(supplierDAO.get("101").getName());
}





