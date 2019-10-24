package com.example.springdata.repository;

import com.example.springdata.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    void deleteAllInBatch();
    List<Person> findAll();
    List<Person> findByFirstName(String firstName);
    @Query("select p from Person  p order by firstName")
    List<Person> findAllOrderedByFirstName();
}
