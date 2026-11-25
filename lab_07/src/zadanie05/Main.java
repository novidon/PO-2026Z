package zadanie05;

public class Main {

    public static void validateNames(String[] names) {

        class NameValidator {

            private static final int MIN_LENGTH = 3;

            public boolean isValid(String name) {
                return name != null && !name.isBlank() && name.length() >= MIN_LENGTH;
            }
        }

        NameValidator validator = new NameValidator();

        System.out.println("Poprawne:");
        for (String name : names) {
            if (validator.isValid(name)) {
                System.out.println("  \"" + name + "\"");
            }
        }

        System.out.println("Niepoprawne:");
        for (String name : names) {
            if (!validator.isValid(name)) {
                System.out.println("  " + (name == null ? "null" : "\"" + name + "\""));
            }
        }
    }

    public static void main(String[] args) {
        validateNames(new String[] {"Anna", null, "", "Al", "   ", "Piotr", "Ewa"});
    }
}
