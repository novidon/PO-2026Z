package zadanie04;

public class Car {

    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car(String brand, String model) {
        this(brand, model, 2026);
    }

    public Car(String brand, String model, int productionYear) {
        this(brand, model, productionYear, 0);
    }

    public Car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public Car(Car other) {
        this(other.brand, other.model, other.productionYear, other.mileage);
    }

    public void drive(double distance) {
        if (distance > 0) {
            this.mileage += distance;
        } else {
            System.out.println("Odległość musi być dodatnia - pominięto.");
        }
    }

    public void showInformation() {
        System.out.println(brand + " " + model + ", rok: " + productionYear
                + ", przebieg: " + mileage + " km");
    }
}
