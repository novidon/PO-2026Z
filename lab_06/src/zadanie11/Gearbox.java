package zadanie11;

public class Gearbox {

    private final int gears;
    private int currentGear;

    public Gearbox(int gears) {
        this.gears = gears;
    }

    public void shiftUp() {
        if (currentGear < gears) {
            currentGear++;
        }
        System.out.println("Bieg: " + currentGear);
    }
}
