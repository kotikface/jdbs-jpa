package com.example.springdata;

import com.example.springdata.entity.Passport;
import com.example.springdata.entity.Person;
import com.example.springdata.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringdataJPAApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringdataJPAApplication.class, args);
	}
	@Autowired
	PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {
		Person person = new Person( "Anna", "Andreeva", "Samara");
		Person p4 = new Person("Alla","Andreeva", "Moscow");

		Passport passportAlla = new Passport("Alla11334");
		Passport passportAnna = new Passport("Anna3242");
		person.setPassport(passportAlla);
		p4.setPassport(passportAnna);
		List<Person> people = Arrays.asList(person,p4);

		personRepository.saveAll(people);
	}




}
