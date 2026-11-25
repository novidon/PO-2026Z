package zadanie12;

public abstract class Employee {

    private String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double calculateSalary();
}
