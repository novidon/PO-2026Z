package zoo;

public class Sheep extends Animal {

    public Sheep() {
        this("Dolly");
    }

    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Beee!");
    }
}
