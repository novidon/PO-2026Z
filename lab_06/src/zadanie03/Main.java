package zadanie03;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Piotr", 9000, 1500),
                new Manager("Anna", 10000, 5),
                new Salesperson("Kamil", 5000, 40000, 0.05)
        };

        for (Employee employee : employees) {
            employee.printPayslip();
        }
    }
}
