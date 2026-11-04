package zadanie02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Podaj n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Liczba musi być dodatnia.");
            }
        } while (n <= 0);

        if (n % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }

        if (n % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3.");
        }

        long sum = 0;
        int evenCount = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Suma: " + sum);
        System.out.println("Liczb parzystych: " + evenCount);

        scanner.close();
    }
}
