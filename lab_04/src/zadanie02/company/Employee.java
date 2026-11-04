package zadanie02.company;

import zadanie02.people.Person;

public class Employee extends Person {

    public void inspectSelf() {
        // privateField; // błąd kompilacji
        // packagePrivateField; // błąd kompilacji
        System.out.println("Employee (podklasa, inny pakiet): "
                + this.protectedField + ", " + this.publicField);
    }

    public void inspectOther(Person other) {
        // other.protectedField; // błąd kompilacji
        System.out.println("Employee -> inny obiekt Person: " + other.publicField);
    }
}
