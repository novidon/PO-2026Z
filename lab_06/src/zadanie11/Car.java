package zadanie11;

public class Car {

    private final String model;
    private final Engine engine;
    private final Gearbox gearbox;

    // Car creates its own parts, so they live and die with it (composition)
    public Car(String model, int horsePower, int gears) {
        this.model = model;
        this.engine = new Engine(horsePower);
        this.gearbox = new Gearbox(gears);
    }

    public void start() {
        System.out.println(model + " startuje.");
        engine.start();
    }

    public void drive() {
        if (!engine.isRunning()) {
            System.out.println("Najpierw trzeba uruchomić silnik.");
            return;
        }
        gearbox.shiftUp();
        System.out.println(model + " jedzie.");
    }
}
