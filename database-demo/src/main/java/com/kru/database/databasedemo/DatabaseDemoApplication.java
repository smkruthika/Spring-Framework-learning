package com.kru.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kru.database.databasedemo.entity.Person;
import com.kru.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(DatabaseDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

//	@Autowired
	PersonJdbcDao personJdbcDao;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		logger.info("Getting all person data {}", personJdbcDao.findAll());
//		logger.info("Getting  person 10001 {}", personJdbcDao.findById(10001));
//		logger.info("Deleting  person 10001 {}", personJdbcDao.deleteById(10001));
//		logger.info("Adding  person 10004 {}", personJdbcDao.insert(
//				new Person(10004, "Kru", "Bangalore", new Date())));
//		logger.info("Updating  person 10003 {}", personJdbcDao.update(
//				new Person(10003, "Kru", "Bangalore", new Date())));
	}

}
