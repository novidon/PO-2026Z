package zadanie10;

public class RegistrationForm {

    private final Validator validator = new NotBlankValidator();

    public void submit(String login) {
        if (validator.isValid(login)) {
            System.out.println("Rejestracja: zarejestrowano \"" + login + "\"");
        } else {
            System.out.println("Rejestracja: login nie może być pusty");
        }
    }
}
