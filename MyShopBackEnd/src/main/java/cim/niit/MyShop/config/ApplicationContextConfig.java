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
