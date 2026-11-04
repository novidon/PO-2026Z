package zadanie04;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Bez kopii defensywnej ===");
        int[] data = {10, 20, 30};
        ExamResultsUnsafe unsafe = new ExamResultsUnsafe(data);

        data[0] = -100;
        System.out.println("1) po zmianie oryginału:   " + Arrays.toString(unsafe.getPoints()));

        unsafe.getPoints()[1] = -200;
        System.out.println("2) po zmianie z getPoints: " + Arrays.toString(unsafe.getPoints()));

        System.out.println("=== Z kopią defensywną ===");
        int[] data2 = {10, 20, 30};
        ExamResults safe = new ExamResults(data2);

        data2[0] = -100;
        System.out.println("1) po zmianie oryginału:   " + safe);

        safe.getPoints()[1] = -200;
        System.out.println("2) po zmianie z getPoints: " + safe);
    }
}
