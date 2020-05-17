package com.kru.basics.only.spring.noSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class NoSpringBootApplication {

	private final static Logger logger = LoggerFactory.getLogger(NoSpringBootApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext =
	      new AnnotationConfigApplicationContext(NoSpringBootApplication.class);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("binary search "+ binarySearch);
		System.out.println("binary search algo"+ binarySearch.getSortAlgorithm());
		System.out.println("binary search1 "+ binarySearch1);
		System.out.println("binary search1 algo "+ binarySearch1.getSortAlgorithm());
		logger.info("Am loggin");
	}

}
