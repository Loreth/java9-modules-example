package person;

import person.api.PersonService;
import person.api.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private List<Person> persons = List.of(
            new Person("Jan", "Kowalski"),
            new Person("Janina", "Nowakowska")
    );

    @Override
    public List<Person> getAllPersons() {
        return persons;
    }
}
