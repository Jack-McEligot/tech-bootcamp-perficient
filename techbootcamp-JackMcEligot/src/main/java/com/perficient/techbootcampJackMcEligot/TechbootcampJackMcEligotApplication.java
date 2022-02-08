package com.perficient.techbootcampJackMcEligot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.perficient.techbootcampJackMcEligot.Entity.PersonEntity;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

//import org.springframework.boot.ApplicationRunner;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackageClasses = PersonEntity.class)
public class TechbootcampJackMcEligotApplication{
	private static final Logger testLogger = LogManager.getLogger(TechbootcampJackMcEligotApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TechbootcampJackMcEligotApplication.class, args);
		testLogger.trace("entering application.");
		testLogger.trace("exiting application.");
//		testLogger.debug("Debugging log");
//		testLogger.info("Info log");
//		testLogger.warn("Hey, this is a warning!");
//		testLogger.error("Oops! We have an Error. OK");
//		testLogger.fatal("Damn! Fatal Error. please fix me.");
	}
	
//	//@Override
//	public void run(ApplicationArguments applicationArguments) throws Exception{
		
//	}

}
