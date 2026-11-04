package zadanie05;

public class Main {

    public static void main(String[] args) {
        System.out.println("Na start: " + Product.getNumberOfProducts());

        new Product("Monitor", 899.99);
        new Product("Klawiatura", 149.0);
        Product mouse = new Product("Mysz", 79.5);

        System.out.println("Po utworzeniu 3 produktów: " + Product.getNumberOfProducts());
        System.out.println("Ostatni: " + mouse.getName() + " - " + mouse.getPrice() + " zł");
    }
}
