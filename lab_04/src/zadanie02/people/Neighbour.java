package zadanie02.people;

public class Neighbour {

    public void inspect(Person person) {
        // person.privateField; // błąd kompilacji
        System.out.println("Neighbour (ten sam pakiet): "
                + person.packagePrivateField + ", "
                + person.protectedField + ", "
                + person.publicField);
    }
}
