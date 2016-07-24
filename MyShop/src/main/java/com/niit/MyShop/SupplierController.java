package com.niit.MyShop;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.MyShop.dao.SupplierDAO;
//import com.niit.MyShop.dao.SupplierDAOImpl;
import com.niit.MyShop.model.Supplier;

@Controller
public class SupplierController {
	@Autowired 
	private SupplierDAO supplierDAO;
	/*@Autowired(required=true)
	@Qualifier(value="supplierDAO")
	public void setSupplierDAO(SupplierDAO ps){
		this.supplierDAO = ps;
		}*/
	 @RequestMapping(value = "/getAllSuppliers", method = RequestMethod.GET)
	 /*public ModelAndView getAllSuppliers() {

			System.out.println("getAllSuppliers");
			
			List<Supplier> supplierList = supplierDAO.list();
			
			ModelAndView mv = new ModelAndView("/CategoryList");
			mv.addObject("supplierList", supplierList);

			return mv;
		}*/

	 public String listSuppliers(Model model){
		 model.addAttribute("supplier", new Supplier());
		 List sList = this.supplierDAO.list();
		 model.addAttribute("supplierList",sList);
		 //System.out.println("in controller" +sList);
		 return "Supplier";
	 }
	 	@RequestMapping(value="/supplier/add", method = RequestMethod.POST)
	 	
	 	/*public ModelAndView addSupplier(@ModelAttribute Supplier supplier) {
			supplierDAO.saveOrUpdate(supplier);
		  return new ModelAndView("/AdminHome");
		 }*/

	 	public String addSupplier(@ModelAttribute("supplier") Supplier supplier ,Model model){
	 		model.addAttribute("supplier" , new Supplier());
	 		model.addAttribute("supplierList", this.supplierDAO.list());
	 		supplierDAO.saveOrUpdate(supplier);
	 		return "redirect:/getAllSuppliers";
	 	}
	 	
	 	@RequestMapping("supplier/remove/{sid}")
	 	/*public ModelAndView deleteSupplier(@ModelAttribute String supplier){
	 		supplierDAO.delete(supplier);
	 		return new ModelAndView ("Supplier");
	 	}*/
	 	public ModelAndView removeSupplier(@PathVariable("sid")String id,Model model) {
	 	/*	throws Exception try{
	 			supplierDAO.delete(id);
	 			model.addAttribute("message","Successfully Delete");
	 		}catch(Exception e){
	 			model.addAttribute("message",e.getMessage());
	 			e.printStackTrace();
	 		}*/
	 		System.out.println("In remove controller.....");
	 		ModelAndView mo = new ModelAndView("Supplier");
	 		mo.addObject("supplier", new Supplier());
	 		mo.addObject("supplierList", this.supplierDAO.list());
	 	//	mo.addObject("supplierList", this.supplierDAO.get(id));
	 		/*model.addAttribute("supplier" ,new Supplier());*/
	 		/*model.addAttribute("supplier", this.supplierDAO.get(id));*/
	 		/*model.addAttribute("supplierList", this.supplierDAO.list());*/
	 		supplierDAO.delete(id);
	 		
	 		return mo;
	 	}
	 	
	 	
	 	@RequestMapping(value="supplier/edit/{sid}" )
//{id}	 	
	 	public String editSupplier(@PathVariable("sid") String id, Supplier supplier , Model model){
	 		System.out.println("editsupplier");
	 		model.addAttribute("supplier" ,new Supplier());
	 		model.addAttribute("supplier", this.supplierDAO.get(id));
	 		model.addAttribute("supplierList", this.supplierDAO.list());
	 		return "Supplier";
	 	}	 	
}


