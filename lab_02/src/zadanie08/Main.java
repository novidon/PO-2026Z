package zadanie08;

public class Main {

    public static void main(String[] args) {
        Counter a = new Counter(0);
        Counter b = new Counter(10);

        a.increaseOther(b);
        a.increaseOther(b);
        b.increaseOther(a);

        System.out.println("a.value = " + a.value);
        System.out.println("b.value = " + b.value);
    }
}
