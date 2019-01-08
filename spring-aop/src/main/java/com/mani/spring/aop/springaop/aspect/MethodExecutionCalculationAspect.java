package com.mani.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	
	@Around(value="com.mani.spring.aop.springaop.aspect.commonJoinPointConfig.TrackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinpoint) throws Throwable
	{
		long startTime= System.currentTimeMillis();
		
		joinpoint.proceed();
		
		long timeTaken=System.currentTimeMillis() - startTime;
		logger.info("Timetaken by {} is {}", joinpoint,timeTaken);
	}
	
	

}
