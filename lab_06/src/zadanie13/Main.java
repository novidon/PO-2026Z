package zadanie13;

public class Main {

    public static void main(String[] args) {
        ReportService reportService = new ReportService(new Database());
        reportService.generateReport();

        // reportService.save("cokolwiek"); // teraz się nie da, ReportService nie jest bazą
    }
}
