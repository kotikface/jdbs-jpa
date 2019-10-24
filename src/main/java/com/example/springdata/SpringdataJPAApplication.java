package com.example.springdata;

import com.example.springdata.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdataJPAApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringdataJPAApplication.class, args);
	}
	@Autowired
	PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {
	/*	Person person = new Person( "Anna", "Andreeva", "Samara");
		Person person1 = new Person( "Anna", "Andreeva", "Samara");
		Person person2 = new Person( "Anna", "Andreeva", "Samara");
		Person p4 = new Person("Alla","Andreeva", "Moscow");
		List<Person> people = Arrays.asList(person,person1,person2,p4);

		personRepository.saveAll(people); */
	}




}
