package zadanie09;

public class Eagle extends Bird implements Flyable {

    public Eagle() {
        super("Orzeł");
    }

    @Override
    protected String favouriteFood() {
        return "mięso";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " szybuje wysoko.");
    }
}
