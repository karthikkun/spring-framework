package com.group.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.group.springframework.basic.BinarySearchImpl;


/*
 * 
 * to define application configuration
 */
@Configuration
@ComponentScan
public class SpringFrameworkBasicApplication {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringFrameworkScopeApplication.class);) {
			
			BinarySearchImpl binarySearchImpl = 
					applicationContext.getBean(BinarySearchImpl.class);
		
			int res = binarySearchImpl.binarySearch(new int[] {1}, 0);
			System.out.println(res+"           ......");			
		}		
	}

}
