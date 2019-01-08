package com.mani.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mani.spring.basics.springin5steps.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	
	public static void main(String[] args) {
		

		
		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);
//				SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		
		SomeCDIBusiness business = applicationcontext.getBean(SomeCDIBusiness.class);
		
		
		
		LOGGER.info("{} dao-{}",business, business.getSomeCDIDAO());
		
		
		
		
	}
}
