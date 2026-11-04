package zadanie12;

import java.util.Arrays;

public class Course {

    public static final int DEFAULT_MAX_STUDENTS = 30;
    public static final int MAX_ALLOWED_STUDENTS = 300;

    private static int numberOfCreatedCourses = 0;

    private final String name;
    private final int maxStudents;
    private final Student[] students;
    private int enrolledCount;

    public Course(String name, int maxStudents) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nazwa kursu nie może być pusta.");
        }
        if (maxStudents <= 0 || maxStudents > MAX_ALLOWED_STUDENTS) {
            throw new IllegalArgumentException(
                    "Limit miejsc musi być w przedziale 1-" + MAX_ALLOWED_STUDENTS + ".");
        }
        this.name = name;
        this.maxStudents = maxStudents;
        this.students = new Student[maxStudents];
        numberOfCreatedCourses++;
    }

    public Course(String name) {
        this(name, DEFAULT_MAX_STUDENTS);
    }

    public String getName() {
        return name;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getEnrolledCount() {
        return enrolledCount;
    }

    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }

    public boolean enroll(Student student) {
        if (student == null
                || enrolledCount >= maxStudents
                || isEnrolled(student.getAlbumNumber())) {
            return false;
        }
        students[enrolledCount++] = student;
        return true;
    }

    public boolean enroll(String name, String albumNumber) {
        return enroll(new Student(name, albumNumber));
    }

    public int enroll(Student first, Student second) {
        int added = 0;
        if (enroll(first)) {
            added++;
        }
        if (enroll(second)) {
            added++;
        }
        return added;
    }

    public boolean isEnrolled(String albumNumber) {
        for (int i = 0; i < enrolledCount; i++) {
            if (students[i].getAlbumNumber().equals(albumNumber)) {
                return true;
            }
        }
        return false;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, enrolledCount);
    }

    @Override
    public String toString() {
        return name + " [" + enrolledCount + "/" + maxStudents + "]";
    }
}
