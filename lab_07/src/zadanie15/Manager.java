package zadanie15;

public class Manager extends Employee {

    private final double baseSalary;
    private final double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
