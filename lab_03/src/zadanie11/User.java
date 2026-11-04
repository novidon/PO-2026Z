package zadanie11;

public class User {

    public static final int MIN_AGE = 13;
    public static final int MAX_AGE = 150;
    public static final int MIN_PASSWORD_LENGTH = 8;

    private static int numberOfUsers = 0;

    private final String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        if (login == null || login.isBlank()) {
            throw new IllegalArgumentException("Login nie może być pusty.");
        }
        this.login = login;
        setPassword(password);
        setAge(age);
        numberOfUsers++;
    }

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new IllegalArgumentException(
                    "Wiek musi należeć do przedziału " + MIN_AGE + "-" + MAX_AGE + ".");
        }
        this.age = age;
    }

    public boolean checkPassword(String providedPassword) {
        return password.equals(providedPassword);
    }

    private void setPassword(String password) {
        if (password == null || password.length() < MIN_PASSWORD_LENGTH) {
            throw new IllegalArgumentException(
                    "Hasło musi mieć co najmniej " + MIN_PASSWORD_LENGTH + " znaków.");
        }
        this.password = password;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (!checkPassword(oldPassword)) {
            return false;
        }
        setPassword(newPassword);
        return true;
    }

    public static int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void showUser() {
        System.out.println("Login: " + login
                + ", hasło: " + "*".repeat(password.length())
                + ", wiek: " + age);
    }
}
