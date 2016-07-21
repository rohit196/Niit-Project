package com.niit.MyShop;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.access.method.P;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.MyShop.dao.CategoryDAO;
import com.niit.MyShop.dao.ProductDAO;
import com.niit.MyShop.dao.SupplierDAO;
import com.niit.MyShop.model.Category;
import com.niit.MyShop.model.GuestCartDetails;
import com.niit.MyShop.model.Product;
import com.niit.MyShop.model.Supplier;

@Controller
public class ProductController {

	@Autowired(required=true)
	private ProductDAO productDAO;

	@Autowired(required = true)
	private CategoryDAO categoryDAO;

	@Autowired(required = true)
	private SupplierDAO supplierDAO;

	/*
	 * @Autowired(required=true)
	 * 
	 * @Qualifier(value="productDAO") public void setProductDAO(ProductDAO ps){
	 * this.productDAO = ps; }
	 */
	ApplicationContext context;
	
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("productList", this.productDAO.list());
		model.addAttribute("categoryList", this.categoryDAO.list());
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "Product";
	}

	// For add and update product both
	@RequestMapping(value = "product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product) {

		Category category = categoryDAO.getByName(product.getCategory_fk().getType());
		categoryDAO.saveOrUpdate(category);  // why to save??

		Supplier supplier = supplierDAO.getByName(product.getSupplier_fk().getName());
		supplierDAO.saveOrUpdate(supplier); // Why to save??
		
		
		
		product.setCategory_fk(category);
		product.setSupplier_fk(supplier);
		
		/*product.setCt_id(category.getCt_id());
		product.setSup_id(supplier.getSup_id());*/
		productDAO.saveOrUpdate(product);

		return "redirect:/getAllProducts";

	}

	@RequestMapping("/product/remove/{id}")
	public String removeProduct(@PathVariable("id") String id, ModelMap model) throws Exception {

		try {
			System.out.println("in product controller delete");
			productDAO.delete(id);
			model.addAttribute("message", "Successfully Added");
			model.addAttribute("product", this.productDAO.get(id));
			model.addAttribute("productList", this.productDAO.list());
			
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			e.printStackTrace();
		}
		
		// redirectAttrs.addFlashAttribute(arg0, arg1)
		return "redirect:/getAllProducts";
	}

	@RequestMapping(value ="/product/edit/{id}")
	public String editProduct(@PathVariable("id") String id, Model model) {
		System.out.println("editProduct");
		model.addAttribute("product", this.productDAO.get(id));
		model.addAttribute("productList", this.productDAO.list());
		model.addAttribute("categoryList", this.categoryDAO.list());
		model.addAttribute("supplierList", this.supplierDAO.list());
	
		return "Product";
	}
	@RequestMapping("product/get/{id}")
	public String getSelectedProduct(@PathVariable("id") String id , Model model){
		System.out.println("getSelectedProduct");
		model.addAttribute("selectedProduct", this.productDAO.get(id));
		model.addAttribute("categoryList", this.categoryDAO.list());
		return "Interface";
	}
	
	
	/*@RequestMapping(method=RequestMethod.GET,value="/getSelectedCatProduct/{categoryId}")
	public ModelAndView getSelectedcatProduct(@PathVariable("categoryId")String category){
		System.out.println("getSelectedCatProduct" +categoryId);
	}*/
	
	@RequestMapping(method=RequestMethod.GET , value="/user/product/{cId}")
	public ModelAndView userDisplayProduct(@PathVariable("cId") String cId){
		System.out.println("inside user product display");
		
		GuestCartDetails guestCart1 =  (GuestCartDetails) context.getBean("guestCartDetails");
		System.out.println("product controller guest" +guestCart1.getPrice());
		
		ModelAndView model = new ModelAndView();
		model = new ModelAndView("userWatch");
		model.addObject("pageCategoryId", cId);
		model.addObject("productList", productDAO.get(cId));
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("auth"+auth.getPrincipal().toString());
		return model;
	}
	
	
	/*@RequestMapping("user/displayProductDetails/{pId}{cId}")
	public ModelAndView displayProductDetails(@PathVariable("pId") String pId ,@PathVariable("cId") String cId){
		ModelAndView model = new ModelAndView();
		model = new ModelAndView("detailsWatch")
				
	}*/
}

