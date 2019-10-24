package com.example.springdata;

import com.example.springdata.entity.Person;
import com.example.springdata.jdbc.PersonJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringdataApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}
	@Autowired
	PersonJdbcDao personJdbcDao;
	@Override
	public void run(String... args) throws Exception {
		Person person = new Person(100, "Anna", "Andreeva", "Samara");
		Person person1 = new Person(101, "Anna", "Andreeva", "Samara");
		Person person2 = new Person(102, "Anna", "Andreeva", "Samara");
		personJdbcDao.insert(person);
		personJdbcDao.insert(person1);
		personJdbcDao.insert(person2);
		System.out.println(">>>>>>>>>" +  personJdbcDao.findALl());
	}




}
