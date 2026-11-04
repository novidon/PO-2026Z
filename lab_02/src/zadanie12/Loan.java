package zadanie12;

import java.time.LocalDate;

public class Loan {

    Book book;
    Reader reader;
    LocalDate loanDate;
    LocalDate dueDate;
    boolean returned;

    public Loan(Book book, Reader reader, int days) {
        this.book = book;
        this.reader = reader;
        this.loanDate = LocalDate.now();
        this.dueDate = loanDate.plusDays(days);
        this.returned = false;
        book.available = false;
    }

    public void returnBook() {
        if (!returned) {
            returned = true;
            book.available = true;
            System.out.println(reader.fullName() + " zwraca książkę: " + book.title);
        }
    }

    public boolean isOverdue(LocalDate today) {
        return !returned && today.isAfter(dueDate);
    }

    public void showInformation() {
        System.out.println(reader.fullName() + " (karta " + reader.cardNumber + ") -> "
                + book.title + ", od " + loanDate + " do " + dueDate);
    }
}
