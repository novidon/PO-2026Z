package zadanie06;

public class Main {

    public static void main(String[] args) {
        Printable[] documents = {
                new Report("Sprzedaż w listopadzie"),
                new Invoice("FV/11/2026", 1230.50)
        };

        for (Printable document : documents) {
            document.print();
            System.out.println();
        }
    }
}
