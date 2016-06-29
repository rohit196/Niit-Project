package com.niit.MyShop.dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.MyShop.model.Category;
@Service
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	
	@Autowired(required=true)
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Category> categorylist(){
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>)
			sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}
	/*public  ArrayList<Category> getAllCategories(){
		  ArrayList<Category> categoryList;
		  categoryList = (ArrayList<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).list();
		  return categoryList;
		}*/
	
	
	/*@Transactional
	public List<Category> list() {
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession()
				.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listCategory;
	}*/
	@Transactional
	public void saveOrUpdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}
	
	/*@Transactional
	public void delete(String id) {
		Category CategoryToDelete = new Category();
		CategoryToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(CategoryToDelete);
	}*/
	@Transactional
	public String delete(String id){
		Category category = new Category();
		category.setId(id);
		try{
			sessionFactory.getCurrentSession().delete(category);
		}catch(HibernateException e){
			e.printStackTrace();
			return e.getMessage();
		}
		return null;
	}
	
	@Transactional
	public Category get(String id) {
		String hql = "from Category where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();
		
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		
		return null;
	}

	@Override
	public ArrayList<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
