package zoo;

public class Cat extends Animal {

    public Cat() {
        this("Filemon");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Miau!");
    }

    public void climb() {
        System.out.println(getName() + " wspina się na drzewo.");
    }
}
