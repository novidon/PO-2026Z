package zadanie12;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Book solaris = new Book("Solaris", "Stanisław Lem", "978-83-08-04961-8");
        Book lalka = new Book("Lalka", "Bolesław Prus", "978-83-7327-038-5");

        Reader anna = new Reader("Anna", "Kowalska", 1001);
        Reader jan = new Reader("Jan", "Nowak", 1002);

        Loan loan1 = anna.borrow(solaris, 14);
        loan1.showInformation();

        Loan loan2 = jan.borrow(solaris, 7);
        System.out.println("loan2 == null: " + (loan2 == null));

        Loan loan3 = jan.borrow(lalka, 30);
        loan3.showInformation();

        solaris.showInformation();
        lalka.showInformation();

        System.out.println("Przeterminowane za 20 dni? "
                + loan1.isOverdue(LocalDate.now().plusDays(20)));

        loan1.returnBook();
        solaris.showInformation();
    }
}
