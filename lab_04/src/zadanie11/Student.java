package zadanie11;

public class Student extends Person {

    private final int albumNumber;

    public Student(String name, int albumNumber) {
        super(name);
        this.albumNumber = albumNumber;
    }

    public int getAlbumNumber() {
        return albumNumber;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Student: " + getName() + ", " + albumNumber);
    }
}
