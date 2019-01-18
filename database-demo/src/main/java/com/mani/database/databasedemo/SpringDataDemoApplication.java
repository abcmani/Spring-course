package com.mani.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mani.database.databasedemo.entity.Person;
import com.mani.database.databasedemo.jdbc.PersonJdbcDao;
import com.mani.database.databasedemo.jpa.PersonJpaRepository;
import com.mani.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users => {}",repository.findAll());
		
		logger.info("Specific user 10001 => {}",repository.findById(10001));
//		
		logger.info("Inserting a entry => {}",
				repository.save(new Person("Tara","Berlin",new Date())));
		
		logger.info("Updating 10002 => {}",
				repository.save(new Person(10002,"Peter","Utrecht",new Date())));
		
		repository.deleteById(10003);
	}
}
