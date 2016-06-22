<<<<<<< HEAD
package cim.niit.MyShop.config;

import java.util.Locale.Category;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.h2.engine.Database;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.MyShop.dao.CategoryDAO;
import com.niit.MyShop.dao.CategoryDAOImpl;

@Configuration
@ComponentScan //("com.niit.MyShop")
@EnableTransactionManagement
public class ApplicationContextConfig {
	

	@Bean(name = "dataSource")
	public BasicDataSource getDatasource(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
	private Properties getHiberbnateProperties(){
		Properties properties = new Properties();
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		return properties;
	}
	@Autowired
	@Bean(name ="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource){
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHiberbnateProperties());
		sessionBuilder.addAnnotatedClasses(Category.class);
		return sessionBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
		
		@Autowired
		@Bean(name = "categoryDao")
		public CategoryDAO getCategoryDao(SessionFactory sessionFactory){
			return new CategoryDAOImpl(sessionFactory);
		}
	}
=======
package cim.niit.MyShop.config;

import java.util.Properties;

@Configuration
@ComponentScan(com.niit.MyShop)
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	/* @Bean(name = "viewResolver")
	 * public InternalResourceResolver getViewResolver(){
	 * InternalResourceViewResolver viewResolver = new InternalResourceViewResover();
	 * viewResolver.setPrefix("/WEB-INF/views/");
	 * viewResolver.setSuffix(".jsp");
	 * return viewResolver;
	 * }
	 */
	@Bean(name = "dataSource")
	public Datasource getDatasource(){
		BasicDataSource datasource = new BasicDataSource();
		dataSource.setDriverClassName("com.H2.jdbc.Driver");
		dataSource.seturl("jdbc:mysql://localhost:3306/niitdb");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}
	private Properties getHberbnateProperties(){
		Properties properties = new Properties();
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
		return properties;
	}
	@autowired
	@Bean(name ="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource){
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClasses(Category.class);
		return sessionBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
		HibernateTransactionManager transactionManager = new HibernateManager(sessionFactory);
		return transactionManager;
		
		@Autowired
		@Bean(name = "categoryDao")
		public CategoryDAO getCategoryDao(SessionFactory sessionFactory){
			return new CategoryDAOImpl(sessionFactory);
		}
	}
	}
>>>>>>> f3e41f3fd585cba1169b2a1c1bd85d08bf03fe29
