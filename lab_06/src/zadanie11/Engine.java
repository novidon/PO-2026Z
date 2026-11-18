package zadanie11;

public class Engine {

    private final int horsePower;
    private boolean running;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void start() {
        running = true;
        System.out.println("Silnik " + horsePower + " KM uruchomiony.");
    }

    public boolean isRunning() {
        return running;
    }
}
