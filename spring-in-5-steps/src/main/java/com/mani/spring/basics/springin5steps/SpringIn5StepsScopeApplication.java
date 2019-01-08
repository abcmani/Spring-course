package com.mani.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mani.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		

		
		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class); 
//				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO persondao = applicationcontext.getBean(PersonDAO.class);
		PersonDAO persondao1 = applicationcontext.getBean(PersonDAO.class);
		
		
		LOGGER.info("{}",persondao);
		LOGGER.info("{}",persondao.getJdbcconnection());
		
		LOGGER.info("{}",persondao1);
		LOGGER.info("{}",persondao1.getJdbcconnection());
		
		
		
		
	}
}
