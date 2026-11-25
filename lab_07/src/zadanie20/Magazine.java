package zadanie20;

public class Magazine extends LibraryItem {

    private static final int LOAN_DAYS = 7;

    private final int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Numer wydania musi być dodatni.");
        }
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public int getLoanDays() {
        return LOAN_DAYS;
    }
}
