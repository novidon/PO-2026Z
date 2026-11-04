package zadanie03;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Skoda", "Octavia", 5);
        car.showInformation();

        System.out.println(car.getBrand() + " / " + car.getModel() + " / " + car.getNumberOfDoors());
    }
}
