package zadanie14;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jan");
        Person student = new Student("Anna", 123456);

        person.identify();
        student.identify();
    }
}
