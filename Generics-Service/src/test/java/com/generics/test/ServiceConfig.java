package com.generics.test;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ComponentScan(basePackages="com.generics")
public class ServiceConfig {
	
	
	@Bean
	public EmbeddedDatabase dataSource(){
		EmbeddedDatabaseBuilder ebBuilder=new EmbeddedDatabaseBuilder();
		ebBuilder.setType(EmbeddedDatabaseType.H2).setScriptEncoding("UTF-8")
		         .addScript("classpath:schema.sql")
		         .addScript("classpath:test-data.sql");
		
		return ebBuilder.build();
	}
	@Bean 
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		
		LocalContainerEntityManagerFactoryBean em= new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan(new String[] {"com.generics"});
		
		JpaVendorAdapter jpaAdaptor=new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(jpaAdaptor);
		em.setJpaProperties(additionalProperties());
		
		return em;
	}
	
	private Properties additionalProperties() {
       Properties prop= new Properties();
       prop.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	   return prop;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf)
	{
		JpaTransactionManager trxManager=new JpaTransactionManager();
		trxManager.setEntityManagerFactory(emf);
		
		return trxManager;
	}

}
