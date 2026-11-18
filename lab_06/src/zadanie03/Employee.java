package zadanie03;

public abstract class Employee {

    private final String name;
    private final double baseSalary;

    public Employee(String name, double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Pensja nie może być ujemna.");
        }
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void printPayslip() {
        System.out.printf("%-8s %-12s podstawa: %9.2f  do wypłaty: %9.2f%n",
                name, getClass().getSimpleName(), baseSalary, calculateSalary());
    }
}
