package zadanie01;

public class Main {

    public static void main(String[] args) {
        // No Computer object is needed here
        Computer.Specifications specifications = new Computer.Specifications(32, 1000, "Ryzen 7 7840HS");
        specifications.print();

        Computer computer = new Computer("Legion 5");
        specifications.showModel(computer);
    }
}
