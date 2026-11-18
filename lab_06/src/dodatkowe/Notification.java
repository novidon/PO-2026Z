package dodatkowe;

public abstract class Notification {

    private final String recipient;
    private final String message;

    public Notification(String recipient, String message) {
        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("Brak odbiorcy.");
        }
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public abstract String format();
}
