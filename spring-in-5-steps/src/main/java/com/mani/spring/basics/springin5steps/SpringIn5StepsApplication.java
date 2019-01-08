package com.mani.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mani.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsApplication {

	//what are beans?
	//what are the dependencies of a bean?
	//where to search for beans?  => no need since all components in single package
	
	
	public static void main(String[] args) {
		
//		BinarySearchImpl binarysearch= new BinarySearchImpl(new QuickSortAlgo());
//		int result = binarysearch.binarySearch(new int[] {12,4,6},3);
//		System.out.println(result);
		
		AnnotationConfigApplicationContext applicationcontext = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class);
//				SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = applicationcontext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl1 = applicationcontext.getBean(BinarySearchImpl.class);
		
		
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);
		
		int result = binarySearchImpl.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);
		
		applicationcontext.close();
	}
}
