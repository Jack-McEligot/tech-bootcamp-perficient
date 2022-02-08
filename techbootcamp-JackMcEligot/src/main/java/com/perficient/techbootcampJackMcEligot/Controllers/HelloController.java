package com.perficient.techbootcampJackMcEligot.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import com.perficient.techbootcampJackMcEligot.Greeting;

@CrossOrigin(origins = "http://localhost:8080")
//@RestController
@Controller
public class HelloController {
//	private static final String template = "Hello, %s!";
//	private final AtomicLong counter = new AtomicLong();
//	@GetMapping("/")
//	public String index() {
//		return "Greetings from Spring Boot!";
//	}
//	@GetMapping("/greeting")
//	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return new Greeting(counter.incrementAndGet(), String.format(template, name));
//	}
	@RequestMapping(path="/welcome")
	public String getWelcomePage() {
		return "index.html";
	}
	@RequestMapping(path="/welcome1")
	public ModelAndView getWelcomePageAsModel() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.html");
		return modelAndView;
	}
}


