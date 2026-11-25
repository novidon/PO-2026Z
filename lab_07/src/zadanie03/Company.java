package zadanie03;

public class Company {

    private final String name;

    public Company(String name) {
        this.name = name;
    }

    public class Department {

        private final String name;

        public Department(String name) {
            this.name = name;
        }

        public void printNames() {
            System.out.println("this.name:         " + this.name);
            System.out.println("Company.this.name: " + Company.this.name);
        }
    }
}
