package zadanie12;

public class Reader {

    String firstName;
    String lastName;
    int cardNumber;

    public Reader(String firstName, String lastName, int cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
    }

    public Loan borrow(Book book, int days) {
        if (!book.available) {
            System.out.println(firstName + " nie może wypożyczyć: " + book.title
                    + " - książka jest już wypożyczona.");
            return null;
        }
        return new Loan(book, this, days);
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}
