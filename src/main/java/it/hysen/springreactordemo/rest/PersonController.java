package it.hysen.springreactordemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.hysen.springreactordemo.model.Person;
import it.hysen.springreactordemo.repository.PersonRepository;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
    private PersonRepository personRespository;
	
	@GetMapping
    public Flux<Person> index() {
        return personRespository.findAll();
    }
	
	
}
