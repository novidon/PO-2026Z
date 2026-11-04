package dodatkowe;

public class Rectangle {

    double width;
    double height;

    public Rectangle() {
        this(1);
    }

    public Rectangle(double side) {
        this(side, side);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other) {
        this(other.width, other.height);
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void scale(double factor) {
        if (factor > 0) {
            width *= factor;
            height *= factor;
        }
    }

    public void showInformation(String label) {
        System.out.println(label + ": " + width + " x " + height
                + ", pole = " + area() + ", obwód = " + perimeter());
    }
}
