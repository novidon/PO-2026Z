package zadanie07;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 16, 60);

        System.out.println(laptop.describe());
        laptop.runProgram("IntelliJ IDEA");
        laptop.turnOn();
        laptop.runProgram("IntelliJ IDEA");
        System.out.println("Producent: " + laptop.getManufacturer());
        System.out.println("RAM: " + laptop.getRamGb() + " GB");
        System.out.printf("Szacowany czas pracy: %.1f h%n", laptop.estimateBatteryLifeHours());
        laptop.turnOff();
    }
}
