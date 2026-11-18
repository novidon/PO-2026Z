package dodatkowe;

public class AlertNotification extends Notification {

    public AlertNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public String format() {
        return "Do: " + getRecipient() + " | UWAGA! " + getMessage().toUpperCase();
    }
}
