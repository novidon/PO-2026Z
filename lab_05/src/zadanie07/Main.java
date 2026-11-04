package zadanie07;

import zoo.Animal;
import zoo.Cat;
import zoo.Cow;
import zoo.Dog;

public class Main {

    public static void specialAction(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.digHole();
        } else if (animal instanceof Cat cat) {
            cat.climb();
        } else {
            System.out.println(animal.getName() + " nie ma specjalnej akcji.");
        }
    }

    public static void main(String[] args) {
        specialAction(new Dog());
        specialAction(new Cat());
        specialAction(new Cow());
    }
}
