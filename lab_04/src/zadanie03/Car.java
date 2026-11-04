package zadanie03;

public class Car extends Vehicle {

    private final int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Liczba drzwi: " + numberOfDoors);
    }
}
