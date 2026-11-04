package zadanie10;

import zoo.Animal;
import zoo.Dog;

public class Main {

    static void identify(Animal animal) {
        System.out.println("Animal");
    }

    static void identify(Dog dog) {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();

        identify(animal);
        animal.makeSound();

        identify(new Dog());
    }
}
