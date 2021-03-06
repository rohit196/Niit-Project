package com.niit.MyShop.dao;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.MyShop.model.Category;

public interface CategoryDAO {

	//public  ArrayList<Category> getAllCategories();
	
	public List<Category> list();
	
	public Category get(String id);
	public Category getByName(String type);
	public void saveOrUpdate(Category category);
	public String delete(String id);


}

