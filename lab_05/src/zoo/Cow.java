package zoo;

public class Cow extends Animal {

    public Cow() {
        this("Mućka");
    }

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Muuu!");
    }
}
