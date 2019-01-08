package com.mani.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mani.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.mani.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		

		
		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
//				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDAO componentdao = applicationcontext.getBean(ComponentDAO.class);
//		PersonDAO persondao1 = applicationcontext.getBean(PersonDAO.class);
		
		
		LOGGER.info("{}",componentdao);
//		LOGGER.info("{}",componentdao.getJdbcconnection());
		
		System.out.println(componentdao);
		System.out.println("Completed");
		
		
		
		
	}
}
