package zadanie12;

public class Student {

    public static final int ALBUM_NUMBER_LENGTH = 6;

    private String name;
    private final String albumNumber;

    public Student(String name, String albumNumber) {
        setName(name);
        if (!isValidAlbumNumber(albumNumber)) {
            throw new IllegalArgumentException(
                    "Numer albumu musi mieć " + ALBUM_NUMBER_LENGTH + " cyfr: " + albumNumber);
        }
        this.albumNumber = albumNumber;
    }

    public Student(String name, int albumNumber) {
        this(name, String.format("%0" + ALBUM_NUMBER_LENGTH + "d", albumNumber));
    }

    private static boolean isValidAlbumNumber(String albumNumber) {
        if (albumNumber == null || albumNumber.length() != ALBUM_NUMBER_LENGTH) {
            return false;
        }
        for (char c : albumNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Imię i nazwisko nie może być puste.");
        }
        this.name = name;
    }

    public String getAlbumNumber() {
        return albumNumber;
    }

    @Override
    public String toString() {
        return name + " (" + albumNumber + ")";
    }
}
