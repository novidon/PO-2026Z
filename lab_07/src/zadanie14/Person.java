package zadanie14;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    // final removed, otherwise Student cannot override it
    public void identify() {
        System.out.println("Person: " + this.name);
    }
}
