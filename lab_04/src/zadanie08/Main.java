package zadanie08;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Solaris", "Stanisław Lem", 1961);

        System.out.println(book);
        System.out.println("getClass():          " + book.getClass());
        System.out.println("getClass().getName(): " + book.getClass().getName());
        System.out.println("getSimpleName():     " + book.getClass().getSimpleName());
        System.out.println("superclass:          " + book.getClass().getSuperclass());
    }
}
