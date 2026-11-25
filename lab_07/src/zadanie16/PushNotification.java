package zadanie16;

public class PushNotification extends Notification {

    private final String title;

    public PushNotification(String recipient, String title) {
        super(recipient);
        this.title = title;
    }

    @Override
    public void send() {
        System.out.println("Push na urządzenie " + getRecipient() + ": " + title);
    }
}
