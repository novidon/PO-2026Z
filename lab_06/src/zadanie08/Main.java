package zadanie08;

public class Main {

    public static void main(String[] args) {
        TextDocument document = new TextDocument();

        Writable writable = document;
        writable.write("Ala ma kota");

        ReadWrite readWrite = document;
        readWrite.append(", a kot ma Alę");

        Readable readable = document;
        System.out.println(readable.read());
    }
}
