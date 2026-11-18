package zadanie03;

public class Developer extends Employee {

    private final double projectBonus;

    public Developer(String name, double baseSalary, double projectBonus) {
        super(name, baseSalary);
        this.projectBonus = projectBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + projectBonus;
    }
}
