package zadanie14;

public class FileStorage implements Storage {

    private final String fileName;

    public FileStorage(String fileName) {
        this.fileName = fileName;
    }

    // Only simulated, no real file is created
    @Override
    public void save(String data) {
        System.out.println("Zapis do pliku " + fileName + ": " + data);
    }
}
