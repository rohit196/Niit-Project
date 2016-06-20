package com.org.MyShop.DAO;

//import java.awt.List;
import java.util.ArrayList;
//import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAO {
	//ArrayList<Category>list = new ArrayList<Category>();
	
	public static ArrayList<Category> getAllCategories(){
		
	ArrayList<Category> list = new ArrayList<Category>();
	Category c1 = new Category();
	c1.setId("Cat_Mob");
	c1.setName("mobile");
	c1.setDescription("This is mobile");
	
	list.add(c1);
	c1 = new Category();
	c1.setId("CAT_EL");
	c1.setName("Electronics");
	c1.setDescription("This is Electronics Category");

	
	list.add(c1);
	c1 = new Category();
	c1.setId("CAT_HK");
	c1.setName("HouseKeeping");
	c1.setDescription("This is HouseKeeping Category");
	return list;
	}	
}
