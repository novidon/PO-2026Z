package zadanie06;

public class Main {

    public static void main(String[] args) {
        System.out.println("Limit: " + Product.MAX_PRODUCTS);

        for (int i = 1; i <= Product.MAX_PRODUCTS + 1; i++) {
            try {
                new Product("Produkt " + i, i * 10);
                System.out.println("Utworzono produkt " + i
                        + " (łącznie: " + Product.getNumberOfProducts() + ")");
            } catch (IllegalStateException e) {
                System.out.println("Produkt " + i + ": " + e.getMessage());
            }
        }

        // Product.MAX_PRODUCTS = 10; // błąd kompilacji
    }
}
