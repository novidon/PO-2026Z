package zadanie03;

public class Book {

    String title;
    String author;
    int publicationYear;

    public Book() {
        this("Bez tytułu", "Nieznany autor");
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void showInformation() {
        System.out.println(title + " - " + author + " (" + publicationYear + ")");
    }
}
