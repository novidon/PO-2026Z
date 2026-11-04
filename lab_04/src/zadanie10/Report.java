package zadanie10;

public class Report extends Document {

    private final String author;

    public Report(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public Report copy() {
        return new Report(getTitle(), author);
    }

    @Override
    public String toString() {
        return "Report[" + getTitle() + ", autor: " + author + "]";
    }
}
