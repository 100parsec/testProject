package de.oliver.hamiko.test.test.project.personDB.data;

import com.github.javafaker.Faker;
import de.oliver.hamiko.test.test.project.personDB.model.Address;
import de.oliver.hamiko.test.test.project.personDB.model.Person;
import de.oliver.hamiko.test.test.project.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.IntStream;

@Component
public class SampleDataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;
    private final Faker faker;

    public SampleDataLoader(PersonRepository personRepository, Faker faker) {
        this.personRepository = personRepository;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("data loaded....");

        //erstellt 10 einträge in DB
        List<Person> people = IntStream.rangeClosed(1, 10).mapToObj(i -> new Person(
                        faker.name().firstName(),
                        faker.name().lastName(),
                        new Address(
                                faker.address().streetAddress(),
                                faker.address().streetAddressNumber(),
                                faker.address().zipCode(),
                                faker.address().city()
                        )
                ))
                .toList();

        personRepository.saveAll(people);

        System.out.println("data saved");
    }
}
