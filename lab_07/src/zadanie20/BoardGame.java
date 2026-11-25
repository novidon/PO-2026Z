package zadanie20;

public class BoardGame extends LibraryItem implements Reservable {

    private static final int LOAN_DAYS = 14;

    private final int maxPlayers;
    private boolean reserved;

    public BoardGame(int id, String title, int maxPlayers) {
        super(id, title);
        if (maxPlayers < 1) {
            throw new IllegalArgumentException("Gra musi mieć co najmniej jednego gracza.");
        }
        this.maxPlayers = maxPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
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
