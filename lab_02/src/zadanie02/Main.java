package zadanie02;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        Point c = new Point(-1, 2);

        System.out.println("Odległość A-B: " + a.distance(b));
        System.out.println("Odległość B-A: " + b.distance(a));
        System.out.println("Odległość A-C: " + a.distance(c));
    }
}
