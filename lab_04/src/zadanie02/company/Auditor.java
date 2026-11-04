package zadanie02.company;

import zadanie02.people.Person;

public class Auditor {

    public void inspect(Person person) {
        // person.privateField; // błąd kompilacji
        // person.protectedField; // błąd kompilacji
        System.out.println("Auditor (inny pakiet, bez dziedziczenia): " + person.publicField);
    }
}
