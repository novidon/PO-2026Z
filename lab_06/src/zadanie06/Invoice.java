package zadanie06;

public class Invoice implements Printable {

    private final String number;
    private final double amount;

    public Invoice(String number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    @Override
    public void printHeader() {
        System.out.println("=== FAKTURA VAT " + number + " ===");
    }

    @Override
    public void print() {
        printHeader();
        System.out.printf("Do zapłaty: %.2f zł%n", amount);
    }
}
