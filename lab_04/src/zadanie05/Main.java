package zadanie05;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Zwierzę");
        Dog dog = new Dog("Burek");
        Cat cat = new Cat("Filemon");
        Cow cow = new Cow("Mućka");

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
