package zadanie01;

public abstract class Shape {

    public abstract double area();

    public void printInformation() {
        System.out.printf("%s, pole = %.2f%n", getClass().getSimpleName(), area());
    }
}
