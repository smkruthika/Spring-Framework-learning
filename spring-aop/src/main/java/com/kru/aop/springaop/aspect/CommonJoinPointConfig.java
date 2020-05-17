package com.kru.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.kru.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.kru.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	//Combining point cuts with &&
	@Pointcut("com.kru.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.kru.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {}
	
	//Bean starting with name Dao
	@Pointcut("bean(Dao*)")
	public void beanContainingDao() {}
	
	//Within data package
	@Pointcut("within(com.kru.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {}
	
	@Pointcut("@annotation(com.kru.aop.springaop.aspect.TrackTime)")
	public void timeTrackAnnotation() {}
}
