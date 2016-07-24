package com.niit.MyShop.dao;

import java.util.List;


import com.niit.MyShop.model.CartDetails;

public interface CartDetailsDAO {
	
	public List<CartDetails> getCart(int uId);
	
	/*public void saveOrUpdate(CartDetails cart);*/
	
	public void save(CartDetails cart);
	
	public void update(int uId,String id,String cat_id,String sid,String qty);
	
	/*public void delete(CartDetails cart);*/

	public void delete(int uId, String id, String cat_id, String sid);
}
