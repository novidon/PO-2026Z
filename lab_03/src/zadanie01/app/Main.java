package zadanie01.app;

import zadanie01.animals.Cat;
import zadanie01.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Burek", 4);
        Cat cat = new Cat("Filemon", 2);

        dog.makeSound();
        cat.makeSound();

        System.out.println(dog.getName() + " ma " + dog.getAge() + " lat(a), "
                + cat.getName() + " ma " + cat.getAge() + " lat(a).");
    }
}
