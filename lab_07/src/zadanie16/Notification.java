package zadanie16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Notification implements Loggable {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private final String recipient;
    private final LocalDateTime createdAt;

    protected Notification(String recipient) {
        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("Brak odbiorcy.");
        }
        this.recipient = recipient;
        this.createdAt = LocalDateTime.now();
    }

    public String getRecipient() {
        return recipient;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public abstract void send();

    @Override
    public String toLogEntry() {
        return createdAt.format(FORMAT) + " " + getClass().getSimpleName() + " do " + recipient;
    }
}
