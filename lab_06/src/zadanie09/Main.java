package zadanie09;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = { new Eagle(), new Sparrow(), new Penguin() };

        for (Bird bird : birds) {
            bird.eat();
        }

        System.out.println();

        Flyable[] flyers = { new Eagle(), new Sparrow() };
        for (Flyable flyer : flyers) {
            flyer.fly();
        }

        // Flyable penguin = new Penguin(); // błąd kompilacji, pingwin nie lata
    }
}
