package dodatkowe;

public class ReminderNotification extends Notification {

    private final String time;

    public ReminderNotification(String recipient, String message, String time) {
        super(recipient, message);
        this.time = time;
    }

    @Override
    public String format() {
        return "Do: " + getRecipient() + " | Przypomnienie na " + time + ": " + getMessage();
    }
}
