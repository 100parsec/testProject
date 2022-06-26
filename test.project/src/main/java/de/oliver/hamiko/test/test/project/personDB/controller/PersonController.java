package de.oliver.hamiko.test.test.project.personDB.controller;

import de.oliver.hamiko.test.test.project.personDB.model.Person;
import de.oliver.hamiko.test.test.project.repository.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/personen")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public ResponseEntity<Page<Person>> findAll(@RequestParam int page, @RequestParam int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        return new ResponseEntity<>(personRepository.findAll(pageRequest), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<Person>> findAllWithoutPage(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> findById(@PathVariable String id){
        Integer personID = Integer.parseInt(id);
        Optional<Person> person = personRepository.findById(personID);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@Valid @RequestBody Person person){
        Person createdPerson = personRepository.save(person);
        return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id){
        Integer personId = Integer.parseInt(id);
        personRepository.deleteById(personId);
    }
}
