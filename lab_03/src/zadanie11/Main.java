package zadanie11;

public class Main {

    public static void main(String[] args) {
        User anna = new User("anna", "tajneHaslo1", 22);
        User jan = new User("jan", "superSekret", 31);

        anna.showUser();
        jan.showUser();

        System.out.println("Zmiana hasła ze złym starym: "
                + anna.changePassword("zle", "noweHaslo123"));
        System.out.println("Zmiana hasła z dobrym starym: "
                + anna.changePassword("tajneHaslo1", "noweHaslo123"));
        System.out.println("checkPassword: " + anna.checkPassword("noweHaslo123"));

        try {
            jan.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Odrzucono wiek: " + e.getMessage());
        }

        System.out.println("Liczba użytkowników: " + User.getNumberOfUsers());
    }
}
