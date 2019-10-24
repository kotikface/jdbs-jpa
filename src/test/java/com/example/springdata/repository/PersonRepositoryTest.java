package com.example.springdata.repository;

import com.example.springdata.entity.Person;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {
   @Autowired
   PersonRepository personRepository;

    @Test
    public void findByFirstName() {
        List<Person> people = personRepository.findByFirstName("Alla");
        Assertions.assertThat(people).hasSize(2);
        Assertions.assertThat(people.get(0).getLastName()).isEqualTo("Andreeva");
        Assertions.assertThat(people.get(1).getLastName()).isEqualTo("Andreeva");
    }

    @Test
    public void findAllOrderedByFirstName() {
      List<Person> people = personRepository.findAllOrderedByFirstName();
        Assertions.assertThat(people).hasSize(8);
        Assertions.assertThat(people.get(7).getFirstName()).isEqualTo("Anna");
        Assertions.assertThat(people.get(1).getFirstName()).isEqualTo("Alla");
    }
}
