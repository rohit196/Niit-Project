package com.niit.MyShop;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.MyShop.dao.CategoryDAO;
import com.niit.MyShop.model.Category;;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/addCategory")
	public ModelAndView addCategory(@ModelAttribute Category category) {
		categoryDAO.saveOrUpdate(category);
	  return new ModelAndView("/AdminHome");
	 }
	
	
	@RequestMapping("/getallCategories")
	public ModelAndView getAllCategories() {

		System.out.println("getAllCategories");
		
		List<Category> categoryList = categoryDAO.list();
		
		ModelAndView mv = new ModelAndView("/CategoryList");
		mv.addObject("categoryList", categoryList);

		return mv;
	}
	
	@RequestMapping("/updateCategories")
	public ModelAndView updateCategory(@ModelAttribute("category") ArrayList<Category> categories)
	{
		Category c =categories.get(0);
		categoryDAO.saveOrUpdate(c);
		
		System.out.println("updating category");
		ModelAndView mv = new ModelAndView("/categoryList");
		
	    List<Category> categoryList = categoryDAO.list();
		mv.addObject("categoryList", categoryList);
		
		return mv;
	}


	
}
