package dodatkowe;

public class Main {

    public static void main(String[] args) {
        Notification[] notifications = {
                new ReminderNotification("anna@example.com", "Kolokwium z PO", "25.11 10:00"),
                new AlertNotification("+48 600 100 200", "Serwer nie odpowiada")
        };

        NotificationSender[] senders = {
                new EmailSender(),
                new SmsSender(),
                new ConsoleSender()
        };

        for (NotificationSender sender : senders) {
            NotificationService service = new NotificationService(sender);
            for (Notification notification : notifications) {
                service.sendNotification(notification);
            }
            System.out.println();
        }
    }
}
