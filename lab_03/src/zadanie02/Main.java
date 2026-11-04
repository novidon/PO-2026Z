package zadanie02;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Anna", 25, "anna@example.com");
        System.out.println(person);

        person.birthday();
        person.setEmail("anna.kowalska@uwm.edu.pl");
        System.out.println(person);

        tryAction("pusty name", () -> person.setName("  "));
        tryAction("wiek 200", () -> person.setAge(200));
        tryAction("e-mail bez @", () -> person.setEmail("anna.example.com"));
        tryAction("konstruktor z wiekiem -1", () -> new Person("Jan", -1, "jan@x.pl"));

        System.out.println("Stan po nieudanych próbach: " + person);
    }

    private static void tryAction(String label, Runnable action) {
        try {
            action.run();
            System.out.println(label + ": OK");
        } catch (IllegalArgumentException e) {
            System.out.println(label + ": odrzucono - " + e.getMessage());
        }
    }
}
