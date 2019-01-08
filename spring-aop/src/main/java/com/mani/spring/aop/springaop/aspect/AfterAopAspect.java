package com.mani.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	//what kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	//Weaving & Weaver
	@AfterReturning(
			value="com.mani.spring.aop.springaop.aspect.commonJoinPointConfig.businessLayerexecution()",
			returning="result")
	public void afterReturning(JoinPoint joinpoint, Object result)
	{
		logger.info("{} Returned with value {}", joinpoint,result);
	}
	
	@AfterThrowing(
			value="com.mani.spring.aop.springaop.aspect.commonJoinPointConfig.businessLayerexecution()",
			throwing="exception")
	public void afterThrowing(JoinPoint joinpoint, Object exception)
	{
		logger.info("{} Thrown exception {}", joinpoint,exception);
	}
	
	@After(value="com.mani.spring.aop.springaop.aspect.commonJoinPointConfig.businessLayerexecution()")
	public void after(JoinPoint joinpoint)
	{
		logger.info("After execution of {} ", joinpoint);
	}

}
