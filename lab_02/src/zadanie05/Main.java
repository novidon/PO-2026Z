package zadanie05;

public class Main {

    public static void main(String[] args) {
        Car original = new Car("Toyota", "Corolla", 2020, 10_000);
        Car copy = new Car(original);

        copy.drive(500);
        copy.model = "Yaris";

        System.out.print("original: ");
        original.showInformation();
        System.out.print("copy:     ");
        copy.showInformation();

        System.out.println("original == copy: " + (original == copy));
    }
}
