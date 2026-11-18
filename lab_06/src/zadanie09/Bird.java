package zadanie09;

public abstract class Bird {

    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " je " + favouriteFood() + ".");
    }

    protected abstract String favouriteFood();
}
