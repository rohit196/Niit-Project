package com.niit.MyShop.config;

import java.util.Properties;



import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.MyShop.dao.*;
import com.niit.MyShop.model.*;
/*import com.niit.MyShop.dao.CategoryDAO;
import com.niit.MyShop.dao.CategoryDAOImpl;
import com.niit.MyShop.dao.ProductDAO;
import com.niit.MyShop.dao.ProductDAOImpl;
import com.niit.MyShop.dao.SupplierDAO;
import com.niit.MyShop.dao.SupplierDAOImpl;
import com.niit.MyShop.dao.UserDAO;
import com.niit.MyShop.dao.UserDAOImpl;
*//*import com.niit.MyShop.model.Category;
import com.niit.MyShop.model.Product;
import com.niit.MyShop.model.Supplier;
import com.niit.MyShop.model.User;
*/
@Configuration
@ComponentScan("com.niit.MyShopBackEnd")
@EnableTransactionManagement
public class ApplicationContextConfig {
	

    
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName("org.h2.Driver");
    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
    	dataSource.setUsername("sa");
    	dataSource.setPassword("");
    	
    	return dataSource;
    }
    
    
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
    	properties.put("hibernate.hbm2ddl.auto", "update");
    	/*properties.put("format_sql", "true");*/
    	//properties.put("hibernate.temp.use_jdbc_metadata_defaults" value = "false" );
    	return properties;
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClasses(Category.class);
    	sessionBuilder.addAnnotatedClass(User.class);
    	sessionBuilder.addAnnotatedClass(Supplier.class);
    	sessionBuilder.addAnnotatedClass(Product.class);
    	sessionBuilder.addAnnotatedClass(CartDetails.class);
    	System.out.println("inside Session Factory");
    	return sessionBuilder.buildSessionFactory();
    }
    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
    
    @Autowired
    @Bean(name = "categoryDAO")
    public CategoryDAO getCategoryDao(SessionFactory sessionFactory) {
    	return new CategoryDAOImpl(sessionFactory);
    }
    
    @Autowired
    @Bean(name = "userDAO")
    public UserDAO getUserDao(SessionFactory sessionFactory) {
    	return new UserDAOImpl(sessionFactory);
    }
    
    @Autowired
    @Bean(name = "supplierDAO")
    public SupplierDAO getSupplierDao(SessionFactory sessionFactory){
    	return new SupplierDAOImpl(sessionFactory);
    }
    
    @Autowired
    @Bean(name = "productDao")
    public ProductDAO getProductDao(SessionFactory sessionFactory){
    	return new ProductDAOImpl(sessionFactory);
    }
    
 @Autowired
 @Bean(name="cartDetailsDao")
 public CartDetailsDAO getCartDetailsDAO(SessionFactory sessionFactory){
	 return new CartDetailsDAOImpl(sessionFactory);
 }
    

}
