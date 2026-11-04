package zadanie04;

public class Manager extends Employee {

    private static final double BONUS_PER_SUBORDINATE = 400;

    private final int numberOfSubordinates;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * 1.2 + BONUS_PER_SUBORDINATE * numberOfSubordinates;
    }
}
