package zadanie08;

public class Main {

    public static void main(String[] args) {
        Button save = new Button("Zapisz");
        Button cancel = new Button("Anuluj");
        Button help = new Button("Pomoc");

        String fileName = "notatki.txt";

        save.setClickListener(new ClickListener() {

            @Override
            public void onClick() {
                System.out.println("  zapisano plik " + fileName);
            }
        });

        cancel.setClickListener(new ClickListener() {

            @Override
            public void onClick() {
                System.out.println("  anulowano zmiany");
            }
        });

        save.click();
        cancel.click();
        help.click();
    }
}
