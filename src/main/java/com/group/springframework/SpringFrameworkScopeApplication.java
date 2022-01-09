package com.group.springframework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.group.springframework.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringFrameworkScopeApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringFrameworkScopeApplication.class); 
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringFrameworkScopeApplication.class);
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info(" {} ", personDAO);
		LOGGER.info(" {} ", personDAO.getJdbcConnection());
		LOGGER.info(" {} ", personDAO2);
		LOGGER.info(" {} ", personDAO2.getJdbcConnection());
		
	}

}
