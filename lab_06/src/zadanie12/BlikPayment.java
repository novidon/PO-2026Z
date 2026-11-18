package zadanie12;

public class BlikPayment implements PaymentMethod {

    private final String code;

    public BlikPayment(String code) {
        this.code = code;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Płatność BLIK (kod %s): %.2f zł%n", code, amount);
    }
}
