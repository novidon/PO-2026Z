package zadanie05;

public class Report implements Printable, Exportable, Savable {

    private final String title;
    private final int pages;

    public Report(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("Raport \"" + title + "\", stron: " + pages);
    }

    @Override
    public String exportToCsv() {
        return "title;pages\n" + title + ";" + pages;
    }

    @Override
    public void save(String fileName) {
        System.out.println("Zapisano raport do pliku " + fileName);
    }
}
