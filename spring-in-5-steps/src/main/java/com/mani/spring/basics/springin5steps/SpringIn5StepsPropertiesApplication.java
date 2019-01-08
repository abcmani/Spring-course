package com.mani.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mani.spring.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	//what are beans?
	//what are the dependencies of a bean?
	//where to search for beans?  => no need since all components in single package
	
	
	public static void main(String[] args) {
		
//		BinarySearchImpl binarysearch= new BinarySearchImpl(new QuickSortAlgo());
//		int result = binarysearch.binarySearch(new int[] {12,4,6},3);
//		System.out.println(result);
		
		AnnotationConfigApplicationContext applicationcontext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);
//				SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		SomeExternalService Service = applicationcontext.getBean(SomeExternalService.class);

		
		
		System.out.println(Service);
		System.out.println(Service.returnServiceURL());

		
		applicationcontext.close();
	}
}
