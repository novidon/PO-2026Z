package zadanie09;

public class Penguin extends Bird {

    public Penguin() {
        super("Pingwin");
    }

    @Override
    protected String favouriteFood() {
        return "ryby";
    }

    public void swim() {
        System.out.println(getName() + " pływa.");
    }
}
