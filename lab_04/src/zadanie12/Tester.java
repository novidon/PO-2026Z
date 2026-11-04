package zadanie12;

public class Tester extends Employee {

    private static final double BONUS_PER_BUG = 20;

    private int bugsFound;

    public Tester(String name, double baseSalary, int yearsOfExperience) {
        super(name, baseSalary, yearsOfExperience);
    }

    public void reportBug() {
        bugsFound++;
    }

    @Override
    public String getRole() {
        return "Tester";
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + BONUS_PER_BUG * bugsFound;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("  " + getName() + " testuje aplikację (zgłoszone błędy: " + bugsFound + ").");
    }

    @Override
    public String toString() {
        return super.toString() + ", błędów: " + bugsFound;
    }
}
