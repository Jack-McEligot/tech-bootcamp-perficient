package com.perficient.techbootcampJackMcEligot.Controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.perficient.techbootcampJackMcEligot.Greeting;
import com.perficient.techbootcampJackMcEligot.Service.jpa.PersonJpaService;

import Domain.Person;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class QueryController {
	@Autowired
	private PersonJpaService pjs;
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
//	@GetMapping("/")
//	public String index() {
//		return "Greetings from Spring Boot!";
//	}
	@GetMapping("/addPerson")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		pjs.AddPerson(new Person(name, "test"));
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	@GetMapping("/getPerson")
	public Person getPersonById(@RequestParam(value = "pid") int pid) {
		return pjs.GetPerson(pid);
	}
	@GetMapping("/getAllPersons")
	public String getAllPersons() {
		List<Person> people = pjs.GetAllPersons();
		System.out.println("all people");
		System.out.println(people);
		return people.toString();
	}
	@GetMapping("/Testlastname")
	public String GetTestLastName() {
		return pjs.GetPeeps().toString();
	}
}