package com.perficient.techbootcampJackMcEligot.Config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.perficient.techbootcampJackMcEligot.Service.jpa.PersonJpaService;

import Domain.Person;

@Configuration
public class InitData {
	@Autowired
	private PersonJpaService personJpaService;
	
	@PostConstruct
	private void init() {
		personJpaService.AddPerson(new Person("Joe", "Mamma"));
		personJpaService.AddPerson(new Person("Ryan", "Reynolds"));
		personJpaService.AddPerson(new Person("Emma", "Stone"));
		personJpaService.AddPerson(new Person("Dwayne", "Johnson"));
		personJpaService.AddPerson(new Person("Bryce", "Vine"));
		personJpaService.AddPerson(new Person("Bob", "Ross"));

	}
	
}
