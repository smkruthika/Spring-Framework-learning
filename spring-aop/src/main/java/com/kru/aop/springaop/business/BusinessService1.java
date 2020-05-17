package com.kru.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kru.aop.springaop.data.Dao1;

@Service
public class BusinessService1 {

	@Autowired
	private Dao1 dao1;
	

	public String calculateSomething() {
		return dao1.retrieveSomething();
		
	}
}
