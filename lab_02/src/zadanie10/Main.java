package zadanie10;

public class Main {

    public static void main(String[] args) {
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);

        System.out.println(a == b);
        System.out.println(a == c);
    }
}
