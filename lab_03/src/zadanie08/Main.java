package zadanie08;

import zadanie07.StaticCalculator;

public class Main {

    public static void main(String[] args) {
        System.out.println("add(2, 3)       = " + StaticCalculator.add(2, 3));
        System.out.println("add(2, 3, 4)    = " + StaticCalculator.add(2, 3, 4));
        System.out.println("add(2.5, 3.5)   = " + StaticCalculator.add(2.5, 3.5));
        System.out.println("add(2, 3.5)     = " + StaticCalculator.add(2, 3.5));

        System.out.println("Liczba operacji: " + StaticCalculator.getNumberOfOperations());
    }
}
