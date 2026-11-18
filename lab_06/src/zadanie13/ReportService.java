package zadanie13;

// Before: ReportService extends Database. Now it just has a Database.
public class ReportService {

    private final Database database;

    public ReportService(Database database) {
        this.database = database;
    }

    public void generateReport() {
        String report = "Raport";
        database.save(report);
    }
}
