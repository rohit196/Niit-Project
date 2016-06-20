package com.org.MyShop;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.MyShop.DAO.Category;
import com.org.MyShop.DAO.CategoryDAO;

@Controller
public class CategoryController {
	
	@RequestMapping("/getallCategories")
	public ModelAndView getAllCategoris(){
		System.out.println("getAllCategories");
		List<Category> categoryList = CategoryDAO.getAllCategories();
		
		ModelAndView mv = new ModelAndView("/CategoryList");
		mv.addObject("categoryList",categoryList);
		return mv;
		
	}

}
