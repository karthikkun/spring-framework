package com.group.springframework.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private Logger LOGGER = 
			LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
	private SortingAlgorithm sortingAlgorithm;

	
//	public BinarySearchImpl(SortingAlgorithm sortingAlgorithm) {
//		super();
//		this.sortillngAlgorithm = sortingAlgorithm;
//	}

	
	public int binarySearch(int[] nums, int searchFor) {
		return -1;
	}
	
	@PostConstruct
	public void postConstruct() {
		/*
		 * as soon as the bean is created and dependecies were wired in
		 * this method would be called
		 */
		LOGGER.info("post Construct called");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("pre Destroy called");
	}
	
}
