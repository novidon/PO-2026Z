package zadanie20;

public class Book extends LibraryItem implements Reservable {

    private static final int LOAN_DAYS = 30;

    private final String author;
    private boolean reserved;

    public Book(int id, String title, String author) {
        super(id, title);
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Autor nie może być pusty.");
        }
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int getLoanDays() {
        return LOAN_DAYS;
    }

    @Override
    public void reserve() {
        this.reserved = true;
    }

    @Override
    public boolean isReserved() {
        return reserved;
    }
}
