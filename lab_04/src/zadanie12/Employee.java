package zadanie12;

public class Employee {

    private final String name;
    private final double baseSalary;
    protected int yearsOfExperience;

    public Employee(String name, double baseSalary, int yearsOfExperience) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Imię nie może być puste.");
        }
        if (baseSalary < 0 || yearsOfExperience < 0) {
            throw new IllegalArgumentException("Pensja i staż nie mogą być ujemne.");
        }
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getRole() {
        return "Pracownik";
    }

    public double calculateSalary() {
        return baseSalary * (1 + 0.02 * yearsOfExperience);
    }

    public void work() {
        System.out.println(name + " wykonuje swoje obowiązki.");
    }

    @Override
    public String toString() {
        return String.format("%s: %s, staż %d lat, pensja %.2f zł",
                getRole(), name, yearsOfExperience, calculateSalary());
    }
}
