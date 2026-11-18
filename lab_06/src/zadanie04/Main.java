package zadanie04;

public class Main {

    public static void main(String[] args) {
        Printable[] elements = {
                new Invoice("FV/11/2026", 1230.50),
                new Report("Sprzedaż w listopadzie"),
                new Ticket("koncert", 42)
        };

        for (Printable element : elements) {
            element.print();
        }
    }
}
