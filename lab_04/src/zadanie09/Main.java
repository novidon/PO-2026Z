package zadanie09;

public class Main {

    public static void main(String[] args) {
        Game game = new Game("Szachy");
        RPG rpg = new RPG("Wiedźmin-like");

        game.start();
        rpg.start();

        Settings settings = new Settings(70);
        System.out.println("Głośność: " + settings.getVolume());
    }
}
