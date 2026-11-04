package zadanie11;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jan Nowak");
        Student student = new Student("Anna Kowalska", 123456);

        person.showInformation();
        student.showInformation();
    }
}
