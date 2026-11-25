package zadanie19;

public class Main {

    static void show(Animal animal) {
        System.out.println("show Animal");
    }

    static void show(Dog dog) {
        System.out.println("show Dog");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();

        show(animal);
        animal.sound();
    }
}
