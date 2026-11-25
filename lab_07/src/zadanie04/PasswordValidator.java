package zadanie04;

public class PasswordValidator {

    private static final int MIN_LENGTH = 8;

    private class ValidationResult {

        private final boolean valid;
        private final String message;

        private ValidationResult(boolean valid, String message) {
            this.valid = valid;
            this.message = message;
        }
    }

    private ValidationResult check(String password) {
        if (password == null || password.isEmpty()) {
            return new ValidationResult(false, "Hasło jest puste.");
        }
        if (password.length() < MIN_LENGTH) {
            return new ValidationResult(false, "Hasło musi mieć co najmniej " + MIN_LENGTH + " znaków.");
        }

        boolean hasDigit = false;
        boolean hasUpper = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }

        if (!hasDigit) {
            return new ValidationResult(false, "Hasło musi zawierać cyfrę.");
        }
        if (!hasUpper) {
            return new ValidationResult(false, "Hasło musi zawierać wielką literę.");
        }
        return new ValidationResult(true, "Hasło jest poprawne.");
    }

    public boolean isValid(String password) {
        return check(password).valid;
    }

    public String getMessage(String password) {
        return check(password).message;
    }
}
