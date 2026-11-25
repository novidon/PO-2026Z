package zadanie02;

public class Main {

    public static void main(String[] args) {
        BankAccount anna = new BankAccount("Anna", 1000);
        BankAccount piotr = new BankAccount("Piotr", 300);

        BankAccount.Transaction rent = anna.new Transaction("Czynsz", -800);
        BankAccount.Transaction salary = piotr.new Transaction("Wypłata", 4500);

        rent.apply();
        salary.apply();

        rent.print();
        salary.print();
    }
}
