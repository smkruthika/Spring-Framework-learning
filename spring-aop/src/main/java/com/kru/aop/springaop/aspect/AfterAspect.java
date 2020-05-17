package com.kru.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

	Logger logger = LoggerFactory.getLogger(BeforeAspect.class);
//	@AfterReturning(
//		value="execution(* com.kru.aop.springaop.business.*.*(..))",
//		returning="result"
//		)
//	private void afterReturning(JoinPoint joinPoint, Object result) {
//		logger.info("{} returned with value {}", joinPoint, result);
//	}
//	
//	@AfterThrowing(
//			value="execution(* com.kru.aop.springaop.business.*.*(..))",
//			throwing="exception"
//			)
//		private void afterReturning(JoinPoint joinPoint, Exception exception) {
//			logger.info("{} returned with exception {}", joinPoint, exception);
//		}
//	
//	@After("execution(* com.kru.aop.springaop.business.*.*(..))")
//		private void after(JoinPoint joinPoint, Exception exception) {
//			logger.info("after execution of {}", joinPoint);
//		}
	
	@Around("com.kru.aop.springaop.aspect.CommonJoinPointConfig.allLayerExecution()")
	private void after(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		logger.info("Time taken by {} is {}", joinPoint, startTime - endTime);
	}

}
