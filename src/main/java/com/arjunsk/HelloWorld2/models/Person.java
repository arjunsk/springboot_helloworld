package com.arjunsk.HelloWorld2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Specified that this is a DATABASE Entity
public class Person {
	
	@Id // Primary Key
	@GeneratedValue(strategy=GenerationType.AUTO) // Auto Generate Values
	private int id;
	private String name;
	
	public Person() {
		this.id = 0;
		this.name = "";
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	// Required for Serializing 
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
