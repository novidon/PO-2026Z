package zadanie14;

public class ReportService {

    private final Storage storage;

    public ReportService(Storage storage) {
        if (storage == null) {
            throw new IllegalArgumentException("Brak miejsca zapisu.");
        }
        this.storage = storage;
    }

    public void generateReport() {
        String report = "Raport";
        storage.save(report);
    }
}
