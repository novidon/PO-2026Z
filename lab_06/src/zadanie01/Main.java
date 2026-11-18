package zadanie01;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(1),
                new Rectangle(3, 4),
                new Triangle(3, 4, 5)
        };

        for (Shape shape : shapes) {
            shape.printInformation();
        }

        // Shape shape = new Shape(); // błąd: Shape is abstract; cannot be instantiated
    }
}
