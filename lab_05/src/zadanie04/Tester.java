package zadanie04;

public class Tester extends Employee {

    private static final double BONUS_PER_BUG = 25;

    private final int bugsFound;

    public Tester(String name, double baseSalary, int bugsFound) {
        super(name, baseSalary);
        this.bugsFound = bugsFound;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + BONUS_PER_BUG * bugsFound;
    }
}
