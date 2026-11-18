package zadanie06;

public class Report implements Printable {

    private final String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        printHeader();
        System.out.println("Raport: " + title);
    }
}
