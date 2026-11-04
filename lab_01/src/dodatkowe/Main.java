package dodatkowe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number;
        do {
            System.out.print("Podaj liczbę: ");
            number = scanner.nextLong();
        } while (number <= 0);

        long reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        System.out.println("Odwrócona liczba: " + reversed);

        scanner.close();
    }
}
