package zadanie03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int size = 10;
        int[] numbers = new int[size];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];
        long sum = 0;

        for (int value : numbers) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            sum += value;
        }

        double average = (double) sum / size;

        int greaterThanAverage = 0;
        for (int value : numbers) {
            if (value > average) {
                greaterThanAverage++;
            }
        }

        System.out.println("Największa wartość: " + max);
        System.out.println("Najmniejsza wartość: " + min);
        System.out.println("Suma: " + sum);
        System.out.println("Średnia: " + average);
        System.out.println("Liczb większych od średniej: " + greaterThanAverage);

        scanner.close();
    }
}
