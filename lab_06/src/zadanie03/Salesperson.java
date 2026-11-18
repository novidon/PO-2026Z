package zadanie03;

public class Salesperson extends Employee {

    private final double salesValue;
    private final double commissionRate;

    public Salesperson(String name, double baseSalary, double salesValue, double commissionRate) {
        super(name, baseSalary);
        this.salesValue = salesValue;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + salesValue * commissionRate;
    }
}
