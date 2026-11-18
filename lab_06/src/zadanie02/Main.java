package zadanie02;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(2);
        System.out.println();
        Shape rectangle = new Rectangle(2, 5);
        System.out.println();

        circle.printInformation();
        rectangle.printInformation();
    }
}
