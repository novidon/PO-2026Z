package zadanie02;

public class Person {

    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 150;

    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Imię nie może być puste.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new IllegalArgumentException(
                    "Wiek musi należeć do przedziału " + MIN_AGE + "-" + MAX_AGE + ".");
        }
        this.age = age;
    }

    public void birthday() {
        setAge(age + 1);
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Niepoprawny adres e-mail: " + email);
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " (" + age + " lat), " + email;
    }
}
