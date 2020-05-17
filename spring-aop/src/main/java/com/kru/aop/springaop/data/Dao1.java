package com.kru.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.kru.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}
}
