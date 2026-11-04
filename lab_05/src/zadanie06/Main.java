package zadanie06;

import zoo.Animal;
import zoo.Cat;
import zoo.Dog;

public class Main {

    public static void main(String[] args) {
        Animal first = new Dog();
        Animal second = new Cat();

        if (first instanceof Dog) {
            Dog dog = (Dog) first;
            dog.digHole();
        }
        if (second instanceof Cat) {
            Cat cat = (Cat) second;
            cat.climb();
        }

        try {
            Dog dog = (Dog) second;
            dog.digHole();
        } catch (ClassCastException e) {
            System.out.println("Wyjątek: " + e.getClass().getName());
            System.out.println("  " + e.getMessage());
        }
    }
}
