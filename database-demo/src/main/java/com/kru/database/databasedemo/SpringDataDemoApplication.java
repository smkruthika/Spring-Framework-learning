package com.kru.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kru.database.databasedemo.entity.Person;
import com.kru.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(DatabaseDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}
	
	@Autowired
	PersonSpringDataRepository personSpringDataRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("hello ");
		logger.info("Adding  person 1 {}", personSpringDataRepository.save(
				new Person(1, "Kru", "Bangalore", new Date())));
		logger.info("Adding  person 2 {}", personSpringDataRepository.save(
				new Person(2, "Sharu", "Chennai", new Date())));
		logger.info("Adding  person 1 {}", personSpringDataRepository.save(
				new Person(3, "Vidya", "Harihar", new Date())));
		logger.info("Adding  person 1 {}", personSpringDataRepository.save(
				new Person(4, "Sambhaji", "Savadi", new Date())));
		logger.info("Getting  person 1 {}", personSpringDataRepository.findById(1));
		
		logger.info("Updating  person 1 {}", personSpringDataRepository.save(
				new Person(1, "Kruthika", "Delhi", new Date())));
				
		 personSpringDataRepository.deleteById(2);
		logger.info("Find all  persons {}", personSpringDataRepository.findAll());
	}

}
