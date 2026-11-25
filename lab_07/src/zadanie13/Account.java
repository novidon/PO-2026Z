package zadanie13;

public class Account {

    private final String owner;
    private double balance;

    public Account(String owner, double balance) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Właściciel nie może być pusty.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Saldo początkowe nie może być ujemne.");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Kwota wpłaty musi być dodatnia.");
        }
        this.balance += amount;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
