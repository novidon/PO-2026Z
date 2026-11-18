package zadanie02;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super("Koło");
        System.out.println("Konstruktor Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
