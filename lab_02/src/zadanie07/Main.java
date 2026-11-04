package zadanie07;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Przypadek 1: second = first ---");
        Person first = new Person("Anna");
        Person second = first;
        second.name = "Maria";
        first.introduceYourself();
        second.introduceYourself();

        System.out.println("--- Przypadek 2: second = new Person(first) ---");
        Person third = new Person("Anna");
        Person fourth = new Person(third);
        fourth.name = "Maria";
        third.introduceYourself();
        fourth.introduceYourself();
    }
}
