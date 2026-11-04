package zadanie06;

public class Manager extends Employee {

    private final String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("  Zarządzany dział: " + department);
    }
}
