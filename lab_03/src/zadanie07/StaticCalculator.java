package zadanie07;

public class StaticCalculator {

    private static int numberOfOperations = 0;

    private StaticCalculator() {
    }

    public static int add(int a, int b) {
        numberOfOperations++;
        return a + b;
    }

    public static int add(int a, int b, int c) {
        numberOfOperations++;
        return a + b + c;
    }

    public static double add(double a, double b) {
        numberOfOperations++;
        return a + b;
    }

    // tak się nie da (ten sam add(int, int)):
    // public static long add(int a, int b) {
    //     return a + b;
    // }

    public static int subtract(int a, int b) {
        numberOfOperations++;
        return a - b;
    }

    public static int multiply(int a, int b) {
        numberOfOperations++;
        return a * b;
    }

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }
}
