package zadanie10;

public class CommentForm {

    private final Validator validator = new NotBlankValidator();

    public void submit(String comment) {
        if (validator.isValid(comment)) {
            System.out.println("Komentarz: dodano \"" + comment + "\"");
        } else {
            System.out.println("Komentarz: treść nie może być pusta");
        }
    }
}
