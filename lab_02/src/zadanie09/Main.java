package zadanie09;

public class Main {

    public static void main(String[] args) {
        Car car = null;

        try {
            car.showInformation();
        } catch (NullPointerException e) {
            System.out.println("Złapano: " + e.getClass().getSimpleName());
        }

        if (car != null) {
            car.showInformation();
        } else {
            System.out.println("Brak samochodu (car == null).");
        }
    }
}
