package zadanie02;

public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        return Math.hypot(otherPoint.x - this.x, otherPoint.y - this.y);
    }
}
