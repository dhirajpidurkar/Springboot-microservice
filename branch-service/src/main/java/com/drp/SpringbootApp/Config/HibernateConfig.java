package com.drp.SpringbootApp.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan
public class HibernateConfig {
	
	@Value("${db.url}")
	private String DB_URL;
	
	@Value("${db.driver}")
	private String DB_DRIVER;
	
	@Value("${db.username}")
	private String DB_USERNAME;
	
	@Value("${db.password}")
	private String DB_PASSWORD;
	
	@Value("${hibernate.dialect}")
	private String HIBERNATE_DIALECT;
	
	@Value("${hibernate.show_sql}")
	private String HIBERNATE_SHOW_SQL;
	
	@Value("${hibernate.hbm2ddl.auto}")
	private String HIBERNATE_HBM2DDL_AUTO;
	
	@Value("${hibernate.format_sql}")
	private String HIBERNATE_FORMAT_SQL;
	
	@Value("${entitymanager.packagestoScan}")
	private String ENTITYMANAGER;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DB_DRIVER);
		dataSource.setUrl(DB_URL);
		dataSource.setUsername(DB_USERNAME);
		dataSource.setPassword(DB_PASSWORD);
		
		return dataSource;	
	}
	
	
	
	@Bean
	public LocalSessionFactoryBean factoryBean() {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(dataSource());
		bean.setPackagesToScan(ENTITYMANAGER);
		
		Properties hibernateproperties = new Properties();
		hibernateproperties.setProperty("hibernate.dialect",HIBERNATE_DIALECT);
		hibernateproperties.setProperty("hibernate.format_sql",HIBERNATE_FORMAT_SQL);
		hibernateproperties.setProperty("hibernate.hbm2ddl.auto",HIBERNATE_HBM2DDL_AUTO);
		hibernateproperties.setProperty("hibernate.show_sql",HIBERNATE_SHOW_SQL);
		
		bean.setHibernateProperties(hibernateproperties);
		
		return bean;
		
	}

}
