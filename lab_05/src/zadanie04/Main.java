package zadanie04;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Piotr", 9000, 1500),
                new Tester("Maria", 7000, 12),
                new Manager("Anna", 10000, 5),
                new Administrator("Tomasz", 8000, 10)
        };

        for (Employee employee : employees) {
            System.out.printf("%-22s %10.2f zł%n", employee, employee.calculateSalary());
        }
    }
}
