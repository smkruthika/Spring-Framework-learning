package com.kru.spring.basics.springIn5Steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kru.spring.basics.componentscan.PersonDao;

@SpringBootApplication
@ComponentScan("com.kru.spring.basics")
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
//		System.out.println("binary search "+ binarySearch);
//		System.out.println("binary search algo"+ binarySearch.getSortAlgorithm());
//		System.out.println("binary search1 "+ binarySearch1);
//		System.out.println("binary search1 algo "+ binarySearch1.getSortAlgorithm());
		
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao1 = applicationContext.getBean(PersonDao.class);
		System.out.println("Person Dao "+ personDao);
		System.out.println("Person1 Dao jdbc"+ personDao.getJdbcConnection());
		System.out.println("Person1 Dao "+ personDao1);
		System.out.println("Person1 Dao jdbc"+ personDao1.getJdbcConnection());
		
	}

}
