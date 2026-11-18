package dodatkowe;

public class ConsoleSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("[KONSOLA] " + message);
    }
}
