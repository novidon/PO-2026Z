package zadanie12;

public class Book {

    String title;
    String author;
    String isbn;
    boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public void showInformation() {
        String status = available ? "dostępna" : "wypożyczona";
        System.out.println(title + " - " + author + " [" + isbn + "] " + status);
    }
}
