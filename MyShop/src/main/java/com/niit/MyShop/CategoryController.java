package com.niit.MyShop;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.MyShop.dao.CategoryDAO;
//import com.niit.MyShop.dao.SupplierDAO;
import com.niit.MyShop.model.Category;
//import com.niit.MyShop.model.Supplier;;

@Controller
public class CategoryController {
	
	/*@Autowired
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
*/
	@Autowired 
	private CategoryDAO categoryDAO;
	@RequestMapping(value = "/getAllCategories", method = RequestMethod.GET)
	 public String listCategories(Model model){
		 model.addAttribute("category", new Category());
		 List sList = this.categoryDAO.list();
		 model.addAttribute("categoryList",sList);
		 //System.out.println("in controller" +sList);
		 return "Category";
	 }
	@RequestMapping(value="/category/add", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category, Model model){
 		model.addAttribute("category" , new Category());
 		model.addAttribute("categoryList" , this.categoryDAO.list());
 		
 		categoryDAO.saveOrUpdate(category);
 		return "Category";
 	}
	@RequestMapping("category/remove/{id}")
 	public ModelAndView deleteCategory(@ModelAttribute String category){
 		categoryDAO.delete(category);
 		return new ModelAndView ("Category");
 	}
 	public String removeCategory(@PathVariable("id")String id,ModelMap model , Category category) throws Exception{
 		try{
 			categoryDAO.delete(id);
 			model.addAttribute("message","Successfully Delete");
 		}catch(Exception e){
 			model.addAttribute("message",e.getMessage());
 			e.printStackTrace();
 		}
 		model.addAttribute("category" , new Category());
 		model.addAttribute("category", this.categoryDAO.get(id));
 		model.addAttribute("categoryList" , this.categoryDAO.list());
 		return "Category";
 	}
 	@RequestMapping(value = "category/edit/{id}")
 	
 	public String editCategory(@PathVariable("id") String id, Model model, Category category){
 		System.out.println("editcategory");
 		model.addAttribute("category" , new Category());
 		model.addAttribute("category", this.categoryDAO.get(id));
 		model.addAttribute("categoryList", this.categoryDAO.list());
 		return "Category";
 	}	 	

}
