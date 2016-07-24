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
	public void saveorUpdate(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
	
	@Transactional
	public void saveOrUpdate(UserDetails userDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(userDetails);
	}
	

	@Transactional
	public void delete(int id) {
		User user = new User();
		user.setId(id);
		sessionFactory.getCurrentSession().delete(user);
	}
	
	@Transactional
	public User get(int id)
	{
		String hql = "from User where id =" +id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<User> list = (List<User>) query.list();
		
		if(list != null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	@Transactional
	public User getUser(String email) {
		String hql = "from User where email='" + email+"'";
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
	/*boolean isAdmin*/
	@Transactional
	public void isValidUser(String email, String password ) {
		String hql = "from User where email= '" + email + "' and " + " password ='" + password+"'";
		
		//String hql = "from User where id="'" + id + "'" and "+" password = "'" + password +"'" ; 
		@SuppressWarnings("deprecation")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);	
		System.out.println(query);
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<User> list = (List<User>) query.list();
		
		if (list != null && !list.isEmpty()) {
		}
	}

		@Transactional
		public void enable(int id,boolean enable)
		{
			Query query = sessionFactory.getCurrentSession().createQuery("update User set enabled='"+enable+"'where id="+id);
			query.executeUpdate();
		}
	
	

	public void saveOrUpdate(UserDAO userDAO) {
		// TODO Auto-generated method stub
		
	}

	

}
