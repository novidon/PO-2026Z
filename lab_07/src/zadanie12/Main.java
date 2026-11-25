package zadanie12;

public class Main {

    public static void main(String[] args) {
        Employee manager = new Manager("Anna", 10000, 2500);

        System.out.println(manager.getName() + ": " + manager.calculateSalary() + " zł");
    }
}
