package zadanie02;

import zadanie02.company.Auditor;
import zadanie02.company.Employee;
import zadanie02.people.Neighbour;
import zadanie02.people.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        person.showFromInside();
        new Neighbour().inspect(person);
        employee.inspectSelf();
        employee.inspectOther(person);
        new Auditor().inspect(person);
    }
}
