package zadanie10;

public class Document {

    private final String title;

    public Document(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Document copy() {
        return new Document(title);
    }

    @Override
    public String toString() {
        return "Document[" + title + "]";
    }
}
