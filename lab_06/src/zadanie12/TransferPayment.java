package zadanie12;

public class TransferPayment implements PaymentMethod {

    private final String accountNumber;

    public TransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Przelew na konto %s: %.2f zł%n", accountNumber, amount);
    }
}
