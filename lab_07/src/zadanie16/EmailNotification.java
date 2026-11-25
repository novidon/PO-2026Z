package zadanie16;

public class EmailNotification extends Notification {

    private final String subject;

    public EmailNotification(String recipient, String subject) {
        super(recipient);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("E-mail do " + getRecipient() + ", temat: " + subject);
    }
}
