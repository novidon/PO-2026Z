package zadanie15;

public class Developer extends Employee {

    private final double salary;

    public Developer(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
