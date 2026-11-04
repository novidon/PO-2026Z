package zadanie05;

import zoo.Animal;
import zoo.Dog;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Burek");
        Animal animal = dog;

        dog.makeSound();
        dog.digHole();

        animal.makeSound();

        animal.setName("Azor");
        System.out.println("dog.getName():  " + dog.getName());
        System.out.println("dog == animal:  " + (dog == animal));
    }
}
