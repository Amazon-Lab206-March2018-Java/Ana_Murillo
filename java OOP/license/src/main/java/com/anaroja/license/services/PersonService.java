package com.anaroja.license.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.license.models.Person;
import com.anaroja.license.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepository;
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
	public void addPerson(@Valid Person person) {
		personRepository.save(person);
	}
	public Person findById(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		return optionalPerson.get();
	}
	public List<Person> findAll() {
		return personRepository.findAll();
	}

}
