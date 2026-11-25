package zadanie08;

public class Button {

    private final String label;
    private ClickListener clickListener;

    public Button(String label) {
        this.label = label;
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        System.out.println("[" + label + "] kliknięty");
        if (clickListener == null) {
            System.out.println("  brak obsługi kliknięcia");
            return;
        }
        clickListener.onClick();
    }
}
