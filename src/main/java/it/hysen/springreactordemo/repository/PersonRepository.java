package it.hysen.springreactordemo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import it.hysen.springreactordemo.model.Person;
import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
	
	Flux<Person> findByName(String name);
	
}
