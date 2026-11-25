package zadanie09;

public class Main {

    public static void main(String[] args) {
        Task task = new Task() {

            private int counter = 0;

            @Override
            public void execute() {
                counter++;
                System.out.println("Wywołanie nr " + counter);
            }
        };

        for (int i = 0; i < 5; i++) {
            task.execute();
        }
    }
}
