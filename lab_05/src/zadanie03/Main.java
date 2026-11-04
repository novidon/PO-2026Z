package zadanie03;

import zoo.Animal;
import zoo.Cat;
import zoo.Cow;
import zoo.Dog;

public class Main {

    public static void present(Animal animal) {
        System.out.println("Prezentacja: " + animal);
        animal.makeSound();
    }

    public static void main(String[] args) {
        present(new Dog());
        present(new Cat());
        present(new Cow());
    }
}
