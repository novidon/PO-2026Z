package zadanie12;

public class Manager extends Employee {

    private static final double BONUS_PER_SUBORDINATE = 300;

    private final int numberOfSubordinates;

    public Manager(String name, double baseSalary, int yearsOfExperience, int numberOfSubordinates) {
        super(name, baseSalary, yearsOfExperience);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String getRole() {
        return "Kierownik";
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + BONUS_PER_SUBORDINATE * numberOfSubordinates;
    }

    @Override
    public void work() {
        System.out.println(getName() + " koordynuje pracę " + numberOfSubordinates + " osób.");
    }

    @Override
    public String toString() {
        return super.toString() + ", podwładnych: " + numberOfSubordinates;
    }
}
