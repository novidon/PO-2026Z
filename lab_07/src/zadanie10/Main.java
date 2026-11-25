package zadanie10;

public class Main {

    public static void main(String[] args) {
        RegistrationForm registration = new RegistrationForm();
        CommentForm comments = new CommentForm();

        registration.submit("dawid");
        registration.submit("   ");

        comments.submit("Super lab!");
        comments.submit(null);
    }
}
