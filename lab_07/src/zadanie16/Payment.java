package zadanie16;

// Unrelated to notifications, but can still be logged
public class Payment implements Loggable {

    private final String orderId;
    private final double amount;

    public Payment(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    @Override
    public String toLogEntry() {
        return "Płatność za zamówienie " + orderId + ": " + amount + " zł";
    }
}
