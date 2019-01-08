package com.mani.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class commonJoinPointConfig {
	
	@Pointcut("execution(* com.mani.spring.aop.springaop.data.*.*(..))")
	public void dataLayerexecution()
	{
		
	}
	@Pointcut("execution(* com.mani.spring.aop.springaop.business.*.*(..))")
	public void businessLayerexecution()
	{
		
	}
	
	@Pointcut("dataLayerexecution() && businessLayerexecution()")
	public void allLayer()
	{
		
	}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao()
	{
		
	}
	
	@Pointcut("@annotation(com.mani.spring.aop.springaop.aspect.TrackTime)")
	public void TrackTimeAnnotation()
	{
		
	}

}
