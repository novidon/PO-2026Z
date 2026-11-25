package zadanie07;

public class Main {

    public static void main(String[] args) {
        Validator emailValidator = new Validator() {

            @Override
            public boolean isValid(String value) {
                if (value == null) {
                    return false;
                }
                int at = value.indexOf('@');
                return at != -1 && value.indexOf('.', at + 1) != -1;
            }
        };

        String[] emails = {"jan@uwm.edu.pl", "jan.kowalski@gmail", "jan.uwm.pl", "a@b.c", null};
        for (String email : emails) {
            System.out.printf("%-20s %b%n", email, emailValidator.isValid(email));
        }
    }
}
