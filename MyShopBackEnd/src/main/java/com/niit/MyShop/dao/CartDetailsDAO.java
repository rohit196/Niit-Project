package com.niit.MyShop.dao;

import java.util.List;


import com.niit.MyShop.model.CartDetails;

public interface CartDetailsDAO {
	
public List<CartDetails> getCart(String uId);
	
	/*public void saveOrUpdate(CartDetails cart);*/
	
	public void save(CartDetails cart);
	
	public void update(String uId,String pId,String cId,String sid,String qty);
	
	/*public void delete(CartDetails cart);*/

	public void delete(String uId, String pId, String cId, String sid);
}
