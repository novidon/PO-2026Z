package zadanie01;

public class Main {

    public static void main(String[] args) {
        Dog reksio = new Dog("Reksio", "kundel", 5);
        Dog burek = new Dog("Burek", "owczarek niemiecki", 3);

        reksio.showInformation();
        reksio.bark();

        burek.showInformation();
        burek.bark();
    }
}
