package printer;

import person.api.PersonService;
import java.util.ServiceLoader;

public class PersonPrinter {
    public static void main(String[] args) {
        PersonService service = ServiceLoader.load(PersonService.class)
                .findFirst()
                .orElseThrow();

        service.getAllPersons().forEach(System.out::println);
    }
}
