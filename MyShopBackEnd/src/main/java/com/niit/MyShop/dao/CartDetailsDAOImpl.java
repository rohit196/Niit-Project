package com.niit.MyShop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.niit.MyShop.model.CartDetails;

@Service
@Repository("cartDetailsDAO")
public class CartDetailsDAOImpl implements CartDetailsDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CartDetailsDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override @Transactional
	public List<CartDetails> getCart(int uId) {
		String hql = "from CartDetails where uId="+uId;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<CartDetails> cartList = query.list();
		if(cartList!=null && !cartList.isEmpty())
			return cartList;
		return null;
	}
	 
	 @Transactional
	 public void update(int uId,String id,String cat_id,String sid,String qty){
		 String hql = "update CartDetails set qty='"+qty+"'where id='"+id+"' and sid='"+sid+"' and uId ='"+uId+"'";
		 Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 query.executeUpdate();
	 }
	
/*	 @Transactional
	public void saveOrUpdate(CartDetails cart) {
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}*/
	
	 @Transactional
	public void save(CartDetails cart) {
		sessionFactory.getCurrentSession().save(cart);
	}

	
	 @Transactional
	public void delete(int uId, String id, String cat_id,String sid) {
		 String hql = "delete from CartDetails where id='"+id+"' and cat_id='"+cat_id+"' and sid='"+sid+"' and uId='"+uId+"'";
		 Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 System.out.println("Deleted");
		 int result = query.executeUpdate();
	}
}
