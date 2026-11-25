package zadanie06;

public class Main {

    public static void main(String[] args) {
        int minimumLength = 5;

        // Uncommenting this line breaks compilation:
        // local variables referenced from an inner class must be final or effectively final
        // minimumLength = 10;

        class Validator {

            public boolean isValid(String value) {
                return value != null && value.length() >= minimumLength;
            }
        }

        Validator validator = new Validator();
        System.out.println("Java   -> " + validator.isValid("Java"));
        System.out.println("Kotlin -> " + validator.isValid("Kotlin"));
    }
}
