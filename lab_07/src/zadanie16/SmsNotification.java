package zadanie16;

public class SmsNotification extends Notification {

    private final String text;

    public SmsNotification(String recipient, String text) {
        super(recipient);
        this.text = text;
    }

    @Override
    public void send() {
        System.out.println("SMS na " + getRecipient() + ": " + text);
    }
}
