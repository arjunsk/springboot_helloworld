package com.arjunsk.HelloWorld2.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arjunsk.HelloWorld2.models.Person;
import com.arjunsk.HelloWorld2.repositories.PersonRepository;


@RestController // Specifies that this is a Rest API
public class PersonController {
	
	@Autowired // You don't need to initialize the object.
    PersonRepository personRepository;
	
	
	@GetMapping("/persons") // URL end point
	public List<Person> getPersonsList() {
		return personRepository.findAll(); // JPA functions
	}

	@GetMapping("/persons/{id}") // PathVariable is used to get ID from the URL
    private Person getPerson(@PathVariable("id") int id) {
		return personRepository.findById(id);
    }

}

