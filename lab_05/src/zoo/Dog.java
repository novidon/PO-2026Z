package zoo;

public class Dog extends Animal {

    public Dog() {
        this("Burek");
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Hau hau!");
    }

    public void digHole() {
        System.out.println(getName() + " kopie dół.");
    }
}
