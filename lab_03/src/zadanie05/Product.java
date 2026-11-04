package zadanie05;

public class Product {

    private static int numberOfProducts = 0;

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}
