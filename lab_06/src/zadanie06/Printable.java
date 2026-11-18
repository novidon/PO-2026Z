package zadanie06;

public interface Printable {

    void print();

    default void printHeader() {
        System.out.println("=== Dokument ===");
    }
}
