package zadanie09;

public class Sparrow extends Bird implements Flyable {

    public Sparrow() {
        super("Wróbel");
    }

    @Override
    protected String favouriteFood() {
        return "ziarno";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " fruwa między drzewami.");
    }
}
