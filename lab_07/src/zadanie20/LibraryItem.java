package zadanie20;

public abstract class LibraryItem {

    private static int numberOfItems;

    private final int id;
    private final String title;

    protected LibraryItem(int id, String title) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id musi być większe od 0.");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Tytuł nie może być pusty.");
        }
        this.id = id;
        this.title = title;
        // Counted only after validation, so a rejected object does not change the counter
        numberOfItems++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static int getNumberOfItems() {
        return numberOfItems;
    }

    public abstract int getLoanDays();

    public String getInformation() {
        return title + " – " + getLoanDays() + " dni";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getInformation();
    }
}
