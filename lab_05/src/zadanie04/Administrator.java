package zadanie04;

public class Administrator extends Employee {

    private final int onCallHours;

    public Administrator(String name, double baseSalary, int onCallHours) {
        super(name, baseSalary);
        this.onCallHours = onCallHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + 60 * onCallHours;
    }
}
