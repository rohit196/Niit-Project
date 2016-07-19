package com.niit.MyShop;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.MyShop.dao.CartDetailsDAO;
import com.niit.MyShop.dao.ProductDAO;
import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.model.CartDetails;
import com.niit.MyShop.model.GuestCartDetails;
import com.niit.MyShop.model.Product;
import com.niit.MyShop.model.User;

@Controller
public class CartController implements ApplicationContextAware{
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private User user;
	
	@Autowired
	private CartDetails cartDetails;
	@Autowired
	private CartDetailsDAO cartDetailsDAO;
	
	@Autowired
	private Product product;
	
	
	private List<GuestCartDetails> guestCart = null;
	ApplicationContext context;
	
	public List<GuestCartDetails> getGuestCart() {
		return guestCart;
	}

	public void setGuestCart(List<GuestCartDetails> guestCart) {
		this.guestCart = guestCart;
	}

	
	
	
	
	@RequestMapping(method=RequestMethod.GET,value="/user/addToCart/{pId}/{cId}")
	public String addtoCartUser(HttpSession session, @PathVariable("pId") int pId, @PathVariable("cId") int cId){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("auth: "+auth);
		
		GuestCartDetails guestCart = (GuestCartDetails) context.getBean("guestCartDetails");
		guestCart.setPrice("1111");
		if (session.getAttribute("loggedUserName") == null || session.getAttribute("loggedUserName") == "") {
			guestCart = (GuestCartDetails) context.getBean("guestCartDetails");
			Product p = productDAO.get("pId");
			guestCart.setpId("pId");
			guestCart.setcId(p.getCategory_fk().getCat_id());
			guestCart.setsId(p.getSupplier_fk().getSid());
			/*guestCart.setPrice(p.getPrice());*/
			guestCart.setQty("1");
		}else{
			user = (User) session.getAttribute("loggedUser");
			cartDetails.setUser_fk(user);
			
			product = productDAO.get("pId");
			cartDetails.setProduct_fk(product);
			cartDetails.setCategory_fk(product.getCategory_fk());
			cartDetails.setSupplier_fk(product.getSupplier_fk());
			cartDetails.setPrice(product.getPrice());
			cartDetails.setQty("1");
			
			/*List<CartDetails> cart = user.getuCart();
			if(cart == null){
				cart = new ArrayList<CartDetails>();
			}
			cart.add(cartItem);*/
			cartDetailsDAO.save(cartDetails);
			//userDao.saveOrUpdate(user);
			System.out.println("saved into cart!");
		}
		
		switch (cId) {
		case 1:
			return "redirect: /MyShop/user/product/1";
		
		case 2: 
			return "redirect: /MyShop/user/product/2";
			
		default:
			return "redirect: user/product/1";
		}
		
	}
		
		
		
		
		
		
		@RequestMapping("displayCart")
		public ModelAndView displayCart(HttpSession session){
			ModelAndView model = new ModelAndView("displayCart");
			user = (User) session.getAttribute("loggedUser");
			List<CartDetails> cartList = cartDetailsDAO.getCart(user.getId());
			model.addObject("cartList",cartList);
			return model;
		}

		
		@RequestMapping("deleteFromCart/{pId}/{cId}/{sid}")
		public String deleteFromCart(HttpSession session, @PathVariable("pId") String pId, @PathVariable("cId") String cId
				,@PathVariable("sid") String sid){
			user = (User) session.getAttribute("loggedUser");
			cartDetailsDAO.delete(user.getId(), pId, cId, sid);
			return "redirect: /MyShop/displayCart";
		}
		
		@RequestMapping("updateCartItemQty")
		public String updateCartItem(HttpSession session,@RequestParam("updateProductId") String pId,@RequestParam
				("updateSupplierId")String sid ,@RequestParam("qty") String qty){
			user = (User) session.getAttribute("loggedUser");
			Product p = productDAO.get(pId);
			cartDetailsDAO.update(user.getId(),pId,p.getCategory_fk().getCat_id(),sid,qty);
			return "redirect: /MyShop/displayCart";
		}

		@Override
		public void setApplicationContext(ApplicationContext arg0) throws BeansException {
			// TODO Auto-generated method stub
			this.context = context;
			System.out.println("Cart controller context"+context);
			
		}
		
}