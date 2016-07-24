package com.niit.MyShop;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.MyShop.dao.CategoryDAO;
import com.niit.MyShop.dao.ProductDAO;
import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.Category;
import com.niit.MyShop.model.Product;
import com.niit.MyShop.model.User;
import com.niit.MyShop.model.UserDetails;
@Controller
public class UserController implements ApplicationContextAware{
/*			
	@Autowired
	UserDAO userDAO;
	ProductDAO productDAO;
	CategoryDAO categoryDAO;
	
	@RequestMapping("/Login")
	public String getLogin()
	{
		return "Login";
	}
	@RequestMapping("/welcome")
	public String basic(){
		return "welcome";
	}
	@RequestMapping("/")
	public String getlanding(){
	 public String getSelectedProduct(@PathVariable("id") String id , Model model)
	{
		System.out.println("Interface page called..");
			System.out.println("getSelectedProduct");
			model.addAttribute("selectedProduct", this.productDAO.get(id));
			model.addAttribute("categoryList", this.categoryDAO.list());
	
		return "Interface";
	}
	@RequestMapping("/Success")
	public String getuser(){
		return "Success";
	}
	@RequestMapping("/AdminHome")
	public String getAdmin()
	{
		return "AdminHome";
	}
	@RequestMapping("/Interface")
	public String getHome()
	{
		return "Interface";
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/Login")
	public String testUseLogin(Model model){
		return "Login";
	}
	
	@RequestMapping("/contact")
	public String getContact()
	{
		return "contact";
	}
	@RequestMapping("/aboutus")
	public String geAboutUs()
	{
		return "aboutus";
	}
	@RequestMapping("/Signup")
	public String getSignup()
	{
		return "Signup";
	}*/
	
	
	//Static Implementation 
/*	@RequestMapping("/isValidUser")
	public ModelAndView isValidUser(@RequestParam(value = "id") String id,
			@RequestParam(value = "password") String password) {
		
		ModelAndView mv;
		System.out.println("in controller");

		String message;
		if(userDAO.isValidUser(id,password,true)){
			message = "Valid Credentials";
			mv = new ModelAndView("AdminHome");
			mv.addObject("message",message);
		}
		else
		{
			message = ("Invalid Credentiasl");
			mv = new ModelAndView("Login");
			mv.addObject("message",message);
		}
		mv.addObject("message",message);
		mv.addObject("name",id);
		return mv;
		}*/
/*	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute UserDetails userDetails) {
		userDAO.saveOrUpdate(userDetails);
	  return new ModelAndView("/AdminHome");
	 }*/
	/*@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		List<Category> ls = new ArrayList<Category>();
		ls=this.categoryDAO.list();
		model.addAttribute("category",new Category());
		model.addAttribute("categoryList",ls);
		model.addAttribute("product", new Product());
		model.addAttribute("productList", this.productDAO.list());
	  return "Interface";
	 }
*/

	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;

   @Autowired
	UserDAO userDAO;
   
   @Autowired
   UserDetails userdetails;
    
   @Autowired
   User user;
 /*   @RequestMapping("/isValidUser")
	public ModelAndView isValidUser(@RequestParam(value = "id") String id,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");
        Category category;
        Product product;
        List<Category> categoryList=new ArrayList<Category>();
        List<Product> productList=new ArrayList<Product>();
		String message;
		ModelAndView mv ;
		if (userDAO.isValidUser(id, password,true)) 
		{
			if(id=="admin")
			{
			message = "Valid credentials";
			 mv = new ModelAndView("AdminHome");
			}
			else{
				message = "Valid credentials";
				 mv = new ModelAndView("Enduser");
			}
		} else {
			message = "Invalid credentials";
			 mv = new ModelAndView("Login");
		}
		mv.addObject("category", new Category());
		mv.addObject("categoryList", this.categoryDAO.list());
		mv.addObject("product", new Product());
		mv.addObject("productList", this.productDAO.list());
		mv.addObject("message", message);
		mv.addObject("name", id);
		return mv;
	}*/
	
	
	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute UserDetails userDetails) {
		userDAO.saveOrUpdate(userDetails);
	  return new ModelAndView("/AdminHome");
	 }
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		List<Category> ls=new ArrayList<Category>();
		ls=this.categoryDAO.list();
		model.addAttribute("category",new Category());
		model.addAttribute("categoryList",ls);
		model.addAttribute("product", new Product());
		model.addAttribute("productList", this.productDAO.list());
	  return "Interface";
	 }
	
	@RequestMapping("/Interface")
	public String getHome(){
		return "Interface";
	}
	@RequestMapping(method=RequestMethod.GET, value="/Login")
	/*public String isValiduser(@RequestParam("username")String email ,@RequestParam("password") String password){*/
		public String isValiduser(){
		/*System.out.println("in Login"+email+password);
		ModelAndView model;
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		System.out.println("inside isvalidate");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
	*/	
		 //UserDAO = userDAO.isValidUser(email, password);
		 
		return "Login";
	}	
	/*@RequestMapping("/isValidUser")
	public ModelAndView isValidUser(@RequestParam(value = "id") String id,
			@RequestParam(value = "password") String password) {
		
		ModelAndView mv;
		System.out.println("in controller");

		String message;
		if(userDAO.isValidUser(id,password,true)){
			message = "Valid Credentials";
			mv = new ModelAndView("AdminHome");
			mv.addObject("message",message);
		}
		else
		{
			message = ("Invalid Credentiasl");
			mv = new ModelAndView("Login");
			mv.addObject("message",message);
		}
		mv.addObject("category", new Category());
		mv.addObject("categoryList", this.categoryDAO.list());
		mv.addObject("product", new Product());
		mv.addObject("productList", this.productDAO.list());
		mv.addObject("message",message);
		mv.addObject("name",id);
		return mv;
	}	
*/	
	@RequestMapping("/AdminHome")
	public  ModelAndView showAdminController(HttpSession session ){
		System.out.println("in adminhome");
		if(session.getAttribute("loggedAdminId")== null || session.getAttribute("loggedAdminId")== ""){
			session.setAttribute("loggedAdminRole", "ROLE_ADMIN");
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String id = auth.getName();
			session.setAttribute("loggedAdminid", id);
			session.setAttribute("loggedAdmin", userDAO.getUser(id));
			System.out.println("session loggedAdmin set to ="+id+"logged Admin = "+((User)session.getAttribute("loggedAdmin")).getId());
		}
		ModelAndView model = new ModelAndView("AdminHome");
		return model;
	}	
	@RequestMapping("/Shops")
	String showShopsController(){
		System.out.println("in Login");
		return "Shops";
	}	
	@RequestMapping("/addCategory")
	String addCategory(){
			System.out.println("in add category");
			return "addCategory";
	}
	/*@RequestParam("id")int id ,*/
	/*@ModelAttribute("Signup") String address,BindingResult result ,*/
	@RequestMapping(method=RequestMethod.POST ,value="/Signup")
	public String getSignup(@Validated @RequestParam("fname") String fname,@RequestParam("sname") String sname, @RequestParam("password") String password, 
			@RequestParam("email") String email ,BindingResult result)
	{
		if(result.hasErrors()){
			return "Signup";
		}else{
			
		
		System.out.println("in signup controller");
/*		System.out.println("id"+id);*/
		
		user.setFname(fname);
		user.setSname(sname);
	/*	user.setId(id);*/
		user.setPassword(password);
		/*user.setMob_no("0");*/
		/*user.setAddress(address);*/
		user.setAdmin(false);
		user.setEmail(email);
		user.setEnabled(true);
		userDAO.saveorUpdate(user);
		
		System.out.println("user saved");
	
		return "Interface";
		}
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/logout")
	public String logout(){
		
		
		return "Interface";
	}
	
	@RequestMapping("/Success")
	public ModelAndView success(HttpSession session){
		System.out.println("inside success");
		if(session.getAttribute("loggedUserId")== null || session.getAttribute("loggedUserId")==""){
			session.setAttribute("loggedUserRole","ROLE_USER");
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String id = auth.getName();
			session.setAttribute("loggedUserid", id);
			session.setAttribute("loggedUser", userDAO.getUser(id));
			System.out.println("session loggedUserid set to ="+id+"logged user ="+((User)session.getAttribute("loggedUser")).getId());
			
		}
		ModelAndView model = new ModelAndView("Success");
		model.addObject("productList",productDAO.list());
		return model;
	}
	
	
	@RequestMapping("home")
	public String home(){
		return "Interface";
	}
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		
	}
	
	
	/*@RequestMapping(method=RequestMethod.GET,value="/Login")
	public String validateUser(@RequestParam("username") String username ,@RequestParam("password") String password){
		System.out.println("UserController"+username+password);
		ModelAndView model;
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.MyShop");
		context.refresh();
		
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		return "Interface";
		
	}
	*/
	
	/*@RequestMapping(method=RequestMethod.GET,value="/userHasLogged")
	public String userHasLogged(HttpSession session,Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		
		user = userDAO.get(username);
		System.out.println("user is now instatiated "+user.getFname());
		
		if(session.getAttribute("loggedUserName")==null || session.getAttribute("loggedUserName")==""){
			session.setAttribute("loggedUserRole", "ROLE_USER");
			session.setAttribute("loggedUserName", username);
			System.out.println("userhaslogged");
			System.out.println("session loggedUsername"+username+"logged user"+user);
		}
		return "Success";
	}*/
}