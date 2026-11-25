package zadanie20;

public class Main {

    public static void main(String[] args) {
        Library library = new Library("WMiI");

        Book book = new Book(1, "Wiedźmin", "Andrzej Sapkowski");

        LibraryItem[] items = {
                book,
                new Magazine(2, "Programista", 112),
                new BoardGame(3, "Catan", 4)
        };

        for (LibraryItem item : items) {
            System.out.println(item);
            library.printLoanInformation(item);
            library.addItem(item);
        }

        System.out.println();
        System.out.println("Liczba elementów: " + LibraryItem.getNumberOfItems());

        try {
            new Book(-5, "", "Nikt");
        } catch (IllegalArgumentException e) {
            System.out.println("Nie utworzono książki: " + e.getMessage());
        }
        System.out.println("Liczba elementów po błędzie: " + LibraryItem.getNumberOfItems());

        System.out.println();
        library.printAll();

        System.out.println();
        book.reserve();
        System.out.println(book.getTitle() + " zarezerwowana: " + book.isReserved());

        Reservable studyRoom = new Reservable() {

            private boolean reserved;

            @Override
            public void reserve() {
                this.reserved = true;
                System.out.println("Sala do nauki zarezerwowana.");
            }

            @Override
            public boolean isReserved() {
                return reserved;
            }
        };

        System.out.println("Sala zarezerwowana: " + studyRoom.isReserved());
        studyRoom.reserve();
        System.out.println("Sala zarezerwowana: " + studyRoom.isReserved());
    }
}
