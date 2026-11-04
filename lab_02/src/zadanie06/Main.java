package zadanie06;

public class Main {

    public static void main(String[] args) {
        Person first = new Person("Anna");
        Person second = first;

        second.name = "Maria";

        first.introduceYourself();
        second.introduceYourself();
        System.out.println("first == second: " + (first == second));
    }
}
