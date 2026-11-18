package zadanie01;

public class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Z tych boków nie da się zbudować trójkąta.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Heron's formula
    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
