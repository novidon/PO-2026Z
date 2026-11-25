package zadanie16;

public class Main {

    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification("jan@uwm.edu.pl", "Wyniki kolokwium"),
                new SmsNotification("+48 600 100 200", "Twój kod: 4821"),
                new PushNotification("pixel-8", "Nowa wiadomość")
        };

        for (Notification notification : notifications) {
            notification.send();
        }

        System.out.println();
        System.out.println("Log:");

        Loggable[] log = {notifications[0], notifications[1], notifications[2], new Payment("ZAM-17", 149.99)};
        for (Loggable entry : log) {
            System.out.println("  " + entry.toLogEntry());
        }
    }
}
