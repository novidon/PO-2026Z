package zadanie12;

public class Main {

    public static void main(String[] args) {
        Payment[] payments = {
                new CardPayment("4111111111111234"),
                new BlikPayment("123456"),
                new TransferPayment("PL61 1090 1014 0000 0712 1981 2874")
        };

        for (Payment payment : payments) {
            payment.pay(99.99);
        }
    }
}
