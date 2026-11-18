package zadanie08;

public class TextDocument implements ReadWrite {

    private String content = "";

    @Override
    public String read() {
        return content;
    }

    @Override
    public void write(String text) {
        content = text == null ? "" : text;
    }
}
