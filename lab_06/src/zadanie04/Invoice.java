package zadanie04;

public class Invoice implements Printable {

    private final String number;
    private final double amount;

    public Invoice(String number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    @Override
    public void print() {
        System.out.printf("Faktura %s na kwotę %.2f zł%n", number, amount);
    }
}
