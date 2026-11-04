package zadanie12;

public class Developer extends Employee {

    private final String mainLanguage;

    public Developer(String name, double baseSalary, int yearsOfExperience, String mainLanguage) {
        super(name, baseSalary, yearsOfExperience);
        this.mainLanguage = mainLanguage;
    }

    @Override
    public String getRole() {
        return "Programista";
    }

    @Override
    public void work() {
        System.out.println(getName() + " pisze kod w języku " + mainLanguage + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", język: " + mainLanguage;
    }
}
