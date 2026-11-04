package zadanie04;

public class Main {

    public static void main(String[] args) {
        Car a = new Car("Toyota", "Corolla");
        Car b = new Car("Skoda", "Octavia", 2018);
        Car c = new Car("Fiat", "126p", 1985, 120_000);

        a.drive(150);
        b.drive(-20);
        c.drive(12.5);

        a.showInformation();
        b.showInformation();
        c.showInformation();
    }
}
