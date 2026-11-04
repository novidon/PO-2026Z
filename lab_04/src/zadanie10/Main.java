package zadanie10;

public class Main {

    public static void main(String[] args) {
        Document document = new Document("Notatka");
        Report report = new Report("Raport kwartalny", "Anna Kowalska");

        Document documentCopy = document.copy();
        Report reportCopy = report.copy();

        System.out.println(documentCopy);
        System.out.println(reportCopy + ", autor kopii: " + reportCopy.getAuthor());
        System.out.println("report == reportCopy: " + (report == reportCopy));
    }
}
