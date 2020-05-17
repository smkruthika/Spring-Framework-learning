package com.kru.aop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Use it only on methods
@Target(ElementType.METHOD)
//Must be available at run time
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}
