package com.niit.MyShop.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.MyShop.dao.SupplierDAO;
import com.niit.MyShop.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO{

		@Autowired
		private SessionFactory sessionFactory;
		
		public SupplierDAOImpl(SessionFactory sessionFactory){
			this.sessionFactory = sessionFactory;
		}
		
		@Transactional
		public List<Supplier> list() {
			@SuppressWarnings("Unchecked")
			List<Supplier> list = (List<Supplier>) sessionFactory.getCurrentSession().createCriteria(Supplier.class).list();
			return list;
		}
		
		@Transactional
		public void saveOrUpdate(Supplier supplier) {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		}
		
		
		@Transactional
		public String delete(String id){
			Supplier supplier = new Supplier();
			supplier.setId(id);
			try{
				sessionFactory.getCurrentSession().delete(supplier);
			}catch(HibernateException e){
				e.printStackTrace();
				return e.getMessage();
			}
			return null;
		}
		
		
		@Transactional
		public Supplier get(String id){
			String hql = "from Supplier where id = " + "'" + id +"'";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			
			@SuppressWarnings("Unchecked")
			List<Supplier> list = (List<Supplier>) ((Criteria) query).list();
			if(list !=null && !list.isEmpty()){
				return list.get(0);
			}
			return null;
		}
		
}
