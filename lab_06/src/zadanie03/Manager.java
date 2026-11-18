package zadanie03;

public class Manager extends Employee {

    private final int teamSize;

    public Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    // 500 zl extra for every person in the team
    @Override
    public double calculateSalary() {
        return getBaseSalary() + teamSize * 500;
    }
}
