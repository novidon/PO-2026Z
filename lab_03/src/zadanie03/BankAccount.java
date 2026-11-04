package zadanie03;

public class BankAccount {

    private final String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Właściciel nie może być pusty.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Saldo początkowe nie może być ujemne.");
        }
        this.owner = owner;
        this.balance = initialBalance;
    }

    public BankAccount(String owner) {
        this(owner, 0);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
