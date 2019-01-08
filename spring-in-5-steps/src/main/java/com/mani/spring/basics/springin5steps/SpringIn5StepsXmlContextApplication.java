package com.mani.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mani.spring.basics.springin5steps.xml.XMLPersonDAO;


public class SpringIn5StepsXmlContextApplication {

	//what are beans?
	//what are the dependencies of a bean?
	//where to search for beans?  => no need since all components in single package
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);
	
	public static void main(String[] args) {
		
		
//		BinarySearchImpl binarysearch= new BinarySearchImpl(new QuickSortAlgo());
//		int result = binarysearch.binarySearch(new int[] {12,4,6},3);
//		System.out.println(result);
		
		ClassPathXmlApplicationContext applicationcontext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//				SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		LOGGER.info("Beans Loaded => {}",(Object)applicationcontext.getBeanDefinitionNames());
		XMLPersonDAO xmlPersonDAO = applicationcontext.getBean(XMLPersonDAO.class);
		
		
		LOGGER.info("{}",xmlPersonDAO);
		LOGGER.info("{}",xmlPersonDAO.getXmlJdbcConnection());
		
		applicationcontext.close();
	}
}
