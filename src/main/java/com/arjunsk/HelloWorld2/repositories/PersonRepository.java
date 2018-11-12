package com.arjunsk.HelloWorld2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arjunsk.HelloWorld2.models.Person;

@Repository
public interface PersonRepository 
extends CrudRepository<Person, Integer> { // Extend the functionality from CrudRepository
	public List<Person> findAll();
	public Person findById(int id);
}

