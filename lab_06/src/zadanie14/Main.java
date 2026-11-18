package zadanie14;

public class Main {

    public static void main(String[] args) {
        Storage[] storages = {
                new DatabaseStorage(),
                new FileStorage("raport.txt"),
                new ConsoleStorage()
        };

        for (Storage storage : storages) {
            new ReportService(storage).generateReport();
        }
    }
}
