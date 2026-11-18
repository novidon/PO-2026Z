package zadanie04;

public class Ticket implements Printable {

    private final String event;
    private final int seat;

    public Ticket(String event, int seat) {
        this.event = event;
        this.seat = seat;
    }

    @Override
    public void print() {
        System.out.println("Bilet na " + event + ", miejsce " + seat);
    }
}
