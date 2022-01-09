package com.group.springframework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.group.springframework.xml.XmlPersonDAO;


public class SpringFrameworkXMLApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkXMLApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			
			LOGGER.info("Beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			LOGGER.info("{} {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
		}
	}

}
