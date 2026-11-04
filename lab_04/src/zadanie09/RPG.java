package zadanie09;

public class RPG extends Game {

    public RPG(String title) {
        super(title);
    }

    @Override
    public void start() {
        if (!isInitialized()) {
            initialize();
        }
        System.out.println("[" + getTitle() + "] Tworzenie postaci i wybór klasy bohatera.");
    }

    // @Override
    // public void initialize() { } // błąd kompilacji
}
