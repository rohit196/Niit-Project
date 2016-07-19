package com.niit.MyShop.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/*import com.niit.MyShop.model.Signup_Details;*/
import com.niit.MyShop.model.User;
import com.niit.MyShop.model.UserDetails;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;


	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;
	}

	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	
	@Transactional
	public void saveOrUpdate(UserDetails userDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(userDetails);
	}
	

	@Transactional
	public void delete(String id) {
		User user = new User();
		user.setId(id);
		sessionFactory.getCurrentSession().delete(user);
	}

	@Transactional
	public User get(String id) {
		String hql = "from User where id=" + id;
		@SuppressWarnings("deprecation")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings({ "unchecked" })
		List<User> list = (List<User>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		
		return null;
	}
	/*@Transactional
	public void saveOrUpdate(Signup_Details signup_Details){
		sessionFactory.getCurrentSession().saveOrUpdate(signup_Details);
	}*/
	
	@Transactional
	public boolean isValidUser(String id, String password, boolean isAdmin) {
		String hql = "from User where id= '" + id + "' and " + " password ='" + password+"'";
		
		//String hql = "from User where id="'" + id + "'" and "+" password = "'" + password +"'" ; 
		@SuppressWarnings("deprecation")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);	
		System.out.println(query);
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<User> list = (List<User>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return true;
		}
		
		return false;
	}


	public void saveOrUpdate(UserDAO userDAO) {
		// TODO Auto-generated method stub
		
	}

}
