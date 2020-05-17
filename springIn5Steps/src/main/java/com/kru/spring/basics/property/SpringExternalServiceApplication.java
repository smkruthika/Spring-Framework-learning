package com.kru.spring.basics.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@ComponentScan("com.kru.spring.basics")
@PropertySource("classpath:app.properties")
public class SpringExternalServiceApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = SpringApplication.run(SpringExternalServiceApplication.class, args);

		ExternalService externalService = applicationContext.getBean(ExternalService.class);
		System.out.println("External Service  "+ externalService);
		System.out.println("External Service  url "+ externalService.getUrl());
	}

}
