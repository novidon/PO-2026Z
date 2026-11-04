package zadanie06;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Jan Nowak", 6500);
        Manager manager = new Manager("Anna Kowalska", 12000, "IT");

        employee.showInformation();
        manager.showInformation();
    }
}
