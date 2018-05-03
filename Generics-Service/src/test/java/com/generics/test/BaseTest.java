package com.generics.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ServiceConfig.class})
public class BaseTest extends AbstractJUnit4SpringContextTests {
	
	ApplicationContext ctxt;
	
	@Before
	public void init(){
		
		ctxt = new AnnotationConfigApplicationContext(ServiceConfig.class);
		ctxt.getAutowireCapableBeanFactory().autowireBean(EmbeddedDatabase.class);
	}

}
