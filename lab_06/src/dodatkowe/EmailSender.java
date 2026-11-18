package dodatkowe;

public class EmailSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
