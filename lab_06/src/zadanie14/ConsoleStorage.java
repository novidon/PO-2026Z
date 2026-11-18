package zadanie14;

public class ConsoleStorage implements Storage {

    @Override
    public void save(String data) {
        System.out.println("[konsola] " + data);
    }
}
