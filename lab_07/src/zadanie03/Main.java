package zadanie03;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("Softline");
        Company.Department department = company.new Department("Dział IT");

        department.printNames();
    }
}
