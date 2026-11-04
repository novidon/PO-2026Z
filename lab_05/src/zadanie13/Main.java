package zadanie13;

public class Main {

    public static void printShape(Shape shape) {
        System.out.printf("%-26s pole = %.2f%n", shape.getName(), shape.area());
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(1),
                new Rectangle(3, 4),
                new Triangle(3, 4, 5),
                new Shape()
        };

        for (Shape shape : shapes) {
            printShape(shape);
        }
    }
}
