package zadanie09;

public class Game {

    private final String title;
    private boolean initialized;

    public Game(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public final void initialize() {
        initialized = true;
        System.out.println("[" + title + "] Ładowanie zasobów, inicjalizacja silnika...");
    }

    public void start() {
        if (!initialized) {
            initialize();
        }
        System.out.println("[" + title + "] Start gry.");
    }

    protected boolean isInitialized() {
        return initialized;
    }
}
