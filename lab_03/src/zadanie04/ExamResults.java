package zadanie04;

import java.util.Arrays;

public class ExamResults {

    private final int[] points;

    public ExamResults(int[] points) {
        if (points == null) {
            throw new IllegalArgumentException("Tablica punktów nie może być null.");
        }
        this.points = Arrays.copyOf(points, points.length);
    }

    public int[] getPoints() {
        return Arrays.copyOf(points, points.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(points);
    }
}
