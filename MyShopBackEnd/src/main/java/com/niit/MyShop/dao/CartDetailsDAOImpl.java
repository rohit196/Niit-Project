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

	 @Transactional
	public List<CartDetails> getCart(String uId) {
		String hql = "from CartDetails where uId="+uId;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<CartDetails> cartList = query.list();
		if(cartList!=null && !cartList.isEmpty())
			return cartList;
		return null;
	}
	 
	 @Transactional
	 public void update(String uId,String pId,String cId,String sid,String qty){
		 String hql = "update CartDetails set qty="+qty+"where pId="+pId+" and sid="+sid+" and uId ='"+uId+"'";
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

/*	 @Transactional
	public void delete(CartDetails cart) {
		sessionFactory.getCurrentSession().delete(cart);
	}*/
	
	 @Transactional
	public void delete(String uId, String pId, String cId,String sid) {
		 String hql = "delete from CartDetails where pId="+pId+" and cId="+cId+" and sid="+sid+" and uId='"+uId+"'";
		 Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 int result = query.executeUpdate();
	}
	
}
