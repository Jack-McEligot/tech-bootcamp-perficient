package com.perficient.techbootcampJackMcEligot.Service.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.Transactional;

import Domain.IncomeComponent;
import Domain.Person;
import com.perficient.techbootcampJackMcEligot.Entity.*;

@Service
public class PersonJpaService {
	@Autowired
	PersonRepository personRepo;
	@Autowired
	IncomeComponentRepository incomeComponentRepo;
	
//	Configuration cfg;
//	SessionFactory sessions;
//	PlatformTransactionManager ptm;
//	
//	PersonJpaService(){
//		cfg= new Configuration();
//		sessions = cfg.buildSessionFactory();
//	}
	
	public Person GetPerson(int personId) {
		Optional<PersonEntity> personEntity = personRepo.findById(personId);
		if (personEntity.isPresent()) {
			return map(personEntity.get());
		} else return null;
	}
	public IncomeComponent GetIncomeComponent(int icId) {
		Optional<IncomeComponentEntity> icEntity = incomeComponentRepo.findById(icId);
		if (icEntity.isPresent()) {
			return map(icEntity.get());
			} else return null;
	}

	//Maps a person entity onto a Person object and returns person object
	public Person map(PersonEntity personEnt) {
		Person newPerson = new Person(personEnt.GetPid(), personEnt.GetFirstname(),
				personEnt.GetLastname());
		return newPerson;
	}
	
	public IncomeComponent map(IncomeComponentEntity icEnt) {
		IncomeComponent newIc = new IncomeComponent(icEnt.GetPid(), icEnt.GetTitle(),
				icEnt.GetAmount());
		return newIc;
	}
	
	//Maps a person onto a PersonEntity object and returns personEntity object
		public PersonEntity map(Person p) {
			PersonEntity newPersonEnt = new PersonEntity(p.GetFirstname(),
					p.GetLastname());
			return newPersonEnt;
		}
		
	//Adds person to database and returns the added person entity
	//@Transactional
	public PersonEntity AddPerson(Person p) {
		PersonEntity newPersonEnt = new PersonEntity(p.GetFirstname(),p.GetLastname());
		PersonEntity addedPersonEnt = personRepo.save(newPersonEnt);
		return addedPersonEnt;
	}
	
	public List<Person> GetAllPersons() {
		List<Person> retList = new ArrayList<Person>();
		Iterable<PersonEntity> persons = personRepo.findAll();
		persons.forEach(PersonEntity -> {retList.add(this.map(PersonEntity));});
		return retList;
	}
	//List<PersonEntity> to List<Person>
	public List<Person> PentListtoPList(List<PersonEntity> pEntList){
		List<Person> retList = new ArrayList<Person>();
		pEntList.forEach(PersonEntity -> {
			retList.add(map(PersonEntity));
		});
		return retList;
	}
	public List<Person> GetPeeps(){
		List<PersonEntity> peList = personRepo.PersonsWithTestlastname();
		return PentListtoPList(peList);
	}
}
