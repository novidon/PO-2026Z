package zadanie15;

public class Main {

    public static double calculate(Employee employee) {
        return employee.calculateSalary();
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Piotr", 9000),
                new Manager("Anna", 10000, 2500)
        };

        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + calculate(employee) + " zł");
        }
    }
}
