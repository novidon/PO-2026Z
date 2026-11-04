package zadanie07;

public class Computer extends Device {

    private final int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        if (ramGb <= 0) {
            throw new IllegalArgumentException("RAM musi być dodatni.");
        }
        this.ramGb = ramGb;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void runProgram(String program) {
        if (!isOn()) {
            System.out.println("Nie można uruchomić " + program + " - komputer jest wyłączony.");
            return;
        }
        System.out.println("Uruchamiam " + program + " (dostępne " + ramGb + " GB RAM)");
    }

    @Override
    public String describe() {
        return super.describe() + ", RAM: " + ramGb + " GB";
    }
}
