package com.niit.MyShop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Iterator;
import com.niit.MyShop.dao.CategoryDAO;
import com.niit.MyShop.dao.CategoryDAOImpl;
import com.niit.MyShop.model.Category;

public class CategoryTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		
		category.setId("1000");
		category.setType("HK002");
		category.setDescription("This is 2nd item");
		System.out.println("first object before saving");
		categoryDAO.saveOrUpdate(category);
		System.out.println("first object after saving");
		
		category.setId("1001");
		category.setType("HK003");
		category.setDescription("This is 3rd item");
		categoryDAO.saveOrUpdate(category);
		
		category.setId("1110");
		category.setType("HK007");
		category.setDescription("This is 7th item");
		categoryDAO.saveOrUpdate(category);
		//Category c = categoryDao.get(1000);
		//System.out.println(c.getId());
	
	
	List<Category> sList  = categoryDAO.list();
	Iterator i = (Iterator) sList.iterator();
	while(i.hasNext()){
		Category s = (Category) i.next();
		System.out.println(s.getDescription());
	}
	
	
	System.out.println("in supplier");
	
	

}
}

