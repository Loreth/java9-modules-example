import person.PersonServiceImpl;
import person.api.PersonService;

module person {
    // Pakiet udostępniany innym modułom
    exports person.api;

    // Zezwolenie na stosowanie refleksji przez moduł printer
    opens person.api to printer;

    // Dostarczana usługa
    provides PersonService with PersonServiceImpl;
}
