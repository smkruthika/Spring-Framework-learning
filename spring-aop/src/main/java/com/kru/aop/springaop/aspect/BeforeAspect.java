package com.kru.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	
	Logger logger = LoggerFactory.getLogger(BeforeAspect.class);
	@Before("com.kru.aop.springaop.aspect.CommonJoinPointConfig.timeTrackAnnotation()")
	private void before(JoinPoint joinPoint) {
		logger.info("Check user access");
		logger.info("Allowed execution for {} ", joinPoint);
	}

}
