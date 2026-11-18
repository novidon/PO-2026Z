package zadanie12;

public class CardPayment implements PaymentMethod {

    private final String maskedCardNumber;

    public CardPayment(String cardNumber) {
        String lastDigits = cardNumber.substring(Math.max(0, cardNumber.length() - 4));
        this.maskedCardNumber = "**** " + lastDigits;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Płatność kartą (%s): %.2f zł%n", maskedCardNumber, amount);
    }
}
