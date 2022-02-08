package com.perficient.techbootcampJackMcEligot;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

import Domain.Person;

//import templates.Person;

@SpringBootTest
class TechbootcampJackMcEligotApplicationTests {
	Person testPerson;
	@Test
	void contextLoads() {
	}
	
	@Test
	void demoTestMethod() {
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Testing Person creation defaults")
	void TestPersonConstructor() {
		testPerson = new Person();
		assertEquals(true, testPerson.GetFirstname().equals("testing"));
	}
	@Test
	@DisplayName("Testing SetFirstname")
	void TestSetFirstName() {
		String s = "testing123";
		testPerson = new Person();
		testPerson.SetFirstname(s);
		assertEquals(true, s.equals(testPerson.GetFirstname()));
	}
	
	
	

}
