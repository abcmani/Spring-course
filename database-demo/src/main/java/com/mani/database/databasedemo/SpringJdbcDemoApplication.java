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

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users => {}",dao.findAll());
		
		logger.info("Specific user 10002 => {}",dao.FindById(10001));
		
		logger.info("Specific location pune => {}",dao.FindByLoc("pune"));
		
		logger.info("Deleting Specific user 10003 => {}",
				dao.DeleteById(10003));
		
		logger.info("Inserting 10005 => {}",
				dao.Insert(new Person(10005,"Tara","Berlin",new Date())));
		
		logger.info("Updating 10002 => {}",
				dao.update(new Person(10002,"Peter","Utrecht",new Date())));
		
	}
}
