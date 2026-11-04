package zadanie06;

public class Product {

    public static final int MAX_PRODUCTS = 5;

    private static int numberOfProducts = 0;

    private String name;
    private double price;

    public Product(String name, double price) {
        if (numberOfProducts >= MAX_PRODUCTS) {
            throw new IllegalStateException(
                    "Osiągnięto limit " + MAX_PRODUCTS + " produktów.");
        }
        setName(name);
        setPrice(price);
        numberOfProducts++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nazwa nie może być pusta.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Cena nie może być ujemna.");
        }
        this.price = price;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}
