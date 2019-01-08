package com.mani.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.spring.aop.springaop.aspect.TrackTime;
import com.mani.spring.aop.springaop.data.Dao1;

@Service
public class Business1 {
	
	@Autowired
	private Dao1 dao1;
	
	@TrackTime
	public String calcsomething()
	{
		return dao1.retrieveSomething();
	}

}
