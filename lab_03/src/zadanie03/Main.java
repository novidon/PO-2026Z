package zadanie03;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jan Kowalski", 100);

        System.out.println("Wpłata 50:      " + account.deposit(50));
        System.out.println("Wpłata -10:     " + account.deposit(-10));
        System.out.println("Wypłata 30:     " + account.withdraw(30));
        System.out.println("Wypłata 1000:   " + account.withdraw(1000));
        System.out.println("Wypłata 0:      " + account.withdraw(0));

        System.out.println(account.getOwner() + ", saldo: " + account.getBalance());

        // account.setBalance(1_000_000); // błąd kompilacji
    }
}
