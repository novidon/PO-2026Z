package zadanie09;

public class InitializationDemo {

    private static int staticField = initStaticField();

    private int instanceField = initInstanceField();

    static {
        System.out.println("2. Blok statyczny (staticField = " + staticField + ")");
    }

    {
        System.out.println("4. Blok instancyjny (instanceField = " + instanceField + ")");
    }

    public InitializationDemo() {
        System.out.println("5. Konstruktor");
    }

    private static int initStaticField() {
        System.out.println("1. Inicjalizacja pola statycznego");
        return 100;
    }

    private int initInstanceField() {
        System.out.println("3. Inicjalizacja pola instancji");
        return 7;
    }
}
