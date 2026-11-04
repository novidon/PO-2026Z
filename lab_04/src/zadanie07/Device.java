package zadanie07;

public class Device {

    private final String manufacturer;
    private boolean on;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
        System.out.println(manufacturer + ": urządzenie włączone");
    }

    public void turnOff() {
        on = false;
        System.out.println(manufacturer + ": urządzenie wyłączone");
    }

    public String describe() {
        return "Producent: " + manufacturer;
    }
}
