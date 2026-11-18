package zadanie08;

public interface ReadWrite extends Readable, Writable {

    default void append(String text) {
        write(read() + text);
    }
}
