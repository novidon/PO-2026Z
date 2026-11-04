package zadanie07;

public class Main {

    public static void main(String[] args) {
        System.out.println("7 + 3 = " + StaticCalculator.add(7, 3));
        System.out.println("7 - 3 = " + StaticCalculator.subtract(7, 3));
        System.out.println("7 * 3 = " + StaticCalculator.multiply(7, 3));

        System.out.println("Liczba operacji: " + StaticCalculator.getNumberOfOperations());

        // new StaticCalculator(); // błąd kompilacji
    }
}
