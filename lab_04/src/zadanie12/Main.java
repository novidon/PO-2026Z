package zadanie12;

public class Main {

    public static void main(String[] args) {
        Developer developer = new Developer("Piotr Zieliński", 9000, 4, "Java");
        Manager manager = new Manager("Anna Kowalska", 11000, 10, 6);
        Tester tester = new Tester("Maria Wiśniewska", 7000, 2);

        tester.reportBug();
        tester.reportBug();
        tester.reportBug();

        developer.work();
        manager.work();
        tester.work();

        System.out.println(developer);
        System.out.println(manager);
        System.out.println(tester);
    }
}
