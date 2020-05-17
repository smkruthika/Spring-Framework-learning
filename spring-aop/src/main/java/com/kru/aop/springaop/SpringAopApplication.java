package com.kru.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kru.aop.springaop.business.BusinessService1;
import com.kru.aop.springaop.business.BusinessService2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);
	@Autowired
	BusinessService1 business1;
	
	@Autowired
	BusinessService2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}

}
