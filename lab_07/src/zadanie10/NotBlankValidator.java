package zadanie10;

public class NotBlankValidator extends Validator {

    @Override
    public boolean isValid(String text) {
        return text != null && !text.isBlank();
    }
}
