package zadanie20;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final String name;
    private final List<LibraryItem> items = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addItem(LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Element nie może być null.");
        }
        items.add(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public void printLoanInformation(LibraryItem item) {
        System.out.println("  " + item.getTitle() + " można wypożyczyć na " + item.getLoanDays() + " dni");
    }

    public void printAll() {
        System.out.println("Biblioteka " + name + ":");
        for (LibraryItem item : items) {
            System.out.println("  " + item);
        }
    }
}
