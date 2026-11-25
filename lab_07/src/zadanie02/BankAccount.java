package zadanie02;

public class BankAccount {

    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public class Transaction {

        private final String description;
        private final double amount;

        public Transaction(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        public void apply() {
            balance += amount;
        }

        public void print() {
            System.out.printf("%s | %s: %.2f zł (saldo: %.2f zł)%n", owner, description, amount, balance);
        }
    }
}
