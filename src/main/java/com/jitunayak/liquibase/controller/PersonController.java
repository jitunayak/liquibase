package com.jitunayak.liquibase.controller;

import com.jitunayak.liquibase.repositories.PersonRepository;
import com.jitunayak.liquibase.models.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    PersonRepository repository;

    Logger logger = (Logger) LoggerFactory.getLogger(PersonController.class);

    @GetMapping("all")
    public ResponseEntity<List<Person>> getAllPerson() {
        try {
            return new ResponseEntity(repository.findAll(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            logger.debug(e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("add")
    public ResponseEntity<Person> addNewPerson(Person person) {
        try {
            return new ResponseEntity(repository.save(person), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            logger.debug(e.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
        }
    }

}
