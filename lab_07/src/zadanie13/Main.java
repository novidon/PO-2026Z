package zadanie13;

public class Main {

    public static void main(String[] args) {
        Account anna = new Account("Anna", 1000);
        Account piotr = new Account("Piotr", 200);

        anna.deposit(500);

        // Each account keeps its own owner and balance now
        System.out.println(anna.getOwner() + ": " + anna.getBalance());
        System.out.println(piotr.getOwner() + ": " + piotr.getBalance());

        try {
            anna.deposit(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
