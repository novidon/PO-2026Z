package zadanie01;

import zoo.Animal;
import zoo.Cat;
import zoo.Dog;

public class Main {

    public static void main(String[] args) {
        Animal first = new Dog();
        Animal second = new Cat();

        System.out.println("first:  referencja Animal, obiekt " + first.getClass().getSimpleName());
        System.out.println("second: referencja Animal, obiekt " + second.getClass().getSimpleName());

        first.makeSound();
        second.makeSound();

        // first.digHole(); // błąd kompilacji
    }
}
