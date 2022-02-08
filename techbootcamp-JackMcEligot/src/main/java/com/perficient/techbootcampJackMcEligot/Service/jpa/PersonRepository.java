package com.perficient.techbootcampJackMcEligot.Service.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.perficient.techbootcampJackMcEligot.Entity.PersonEntity;

//import Domain.Person;

interface PersonRepository extends CrudRepository<PersonEntity, Integer>{
	@Query(value = "SELECT * FROM PERSON p WHERE p.lastname = \"test\"", nativeQuery = true)
	List<PersonEntity> PersonsWithTestlastname();
}
