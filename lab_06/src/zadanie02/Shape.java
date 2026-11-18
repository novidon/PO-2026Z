package zadanie02;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        System.out.println("Konstruktor Shape");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public void printInformation() {
        System.out.printf("%s, pole = %.2f%n", name, area());
    }
}
