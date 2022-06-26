package de.oliver.hamiko.test.test.project.repository;

import de.oliver.hamiko.test.test.project.personDB.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
