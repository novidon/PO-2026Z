package zadanie02;

import zoo.Animal;
import zoo.Cat;
import zoo.Cow;
import zoo.Dog;
import zoo.Sheep;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow(),
                new Sheep()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
