package dodatkowe;

public class NotificationService {

    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        if (sender == null) {
            throw new IllegalArgumentException("Brak nadawcy.");
        }
        this.sender = sender;
    }

    public void sendNotification(Notification notification) {
        sender.send(notification.format());
    }
}
