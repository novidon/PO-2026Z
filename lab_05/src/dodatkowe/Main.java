package dodatkowe;

import zadanie04.Administrator;
import zadanie04.Developer;
import zadanie04.Employee;
import zadanie04.Manager;
import zadanie04.Tester;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Piotr", 9000, 1500),
                new Manager("Anna", 10000, 5),
                new Tester("Maria", 7000, 12),
                new Administrator("Tomasz", 8000, 10)
        };

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }
    }
}
