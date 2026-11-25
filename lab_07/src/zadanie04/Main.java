package zadanie04;

public class Main {

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String[] passwords = {null, "abc", "abcdefgh", "abcdefg1", "Abcdefg1"};

        for (String password : passwords) {
            System.out.printf("%-10s %-5b %s%n", password, validator.isValid(password), validator.getMessage(password));
        }

        // Does not compile: ValidationResult has private access in PasswordValidator
        // PasswordValidator.ValidationResult result = validator.new ValidationResult(true, "ok");
    }
}
