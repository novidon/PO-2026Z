package zadanie12;

public class OrderService {

    private final PaymentMethod paymentMethod;

    public OrderService(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("Brak metody płatności.");
        }
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        System.out.printf("Zamówienie na %.2f zł%n", amount);
        paymentMethod.pay(amount);
    }
}
