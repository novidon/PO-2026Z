package zadanie11;

import zoo.Animal;
import zoo.Dog;
import zoo.GuideDog;

public class Main {

    public static void main(String[] args) {
        Animal animal = new GuideDog();

        System.out.println("animal instanceof Animal        : " + (animal instanceof Animal));
        System.out.println("animal instanceof Dog           : " + (animal instanceof Dog));
        System.out.println("animal instanceof GuideDog      : " + (animal instanceof GuideDog));
        System.out.println("getClass() == Animal.class      : " + (animal.getClass() == Animal.class));
        System.out.println("getClass() == Dog.class         : " + (animal.getClass() == Dog.class));
        System.out.println("getClass() == GuideDog.class    : " + (animal.getClass() == GuideDog.class));
    }
}
