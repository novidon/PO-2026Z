package zadanie07;

public class Laptop extends Computer {

    private static final double AVERAGE_POWER_W = 15.0;

    private final double batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, double batteryCapacityWh) {
        super(manufacturer, ramGb);
        if (batteryCapacityWh <= 0) {
            throw new IllegalArgumentException("Pojemność baterii musi być dodatnia.");
        }
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public double getBatteryCapacityWh() {
        return batteryCapacityWh;
    }

    public double estimateBatteryLifeHours() {
        return batteryCapacityWh / AVERAGE_POWER_W;
    }

    @Override
    public String describe() {
        return super.describe() + ", bateria: " + batteryCapacityWh + " Wh";
    }
}
