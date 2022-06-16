module printer {
    // Zależność od modułu person
    requires person;

    // Konsumowana usługa
    uses person.api.PersonService;
}
