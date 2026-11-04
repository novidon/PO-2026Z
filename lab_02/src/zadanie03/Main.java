package zadanie03;

public class Main {

    public static void main(String[] args) {
        Book first = new Book();
        Book second = new Book("Lalka", "Bolesław Prus");
        Book third = new Book("Solaris", "Stanisław Lem", 1961);

        first.showInformation();
        second.showInformation();
        third.showInformation();
    }
}
