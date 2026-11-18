package zadanie05;

public class Main {

    public static void main(String[] args) {
        Report report = new Report("Wyniki kwartalne", 12);

        Printable printable = report;
        Exportable exportable = report;
        Savable savable = report;

        printable.print();
        // printable.save("a.txt"); // błąd: cannot find symbol

        System.out.println(exportable.exportToCsv());
        // exportable.print(); // błąd

        savable.save("raport.txt");
        // savable.exportToCsv(); // błąd

        // ale to dalej ten sam obiekt
        System.out.println(printable == savable);
    }
}
