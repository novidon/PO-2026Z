package zadanie12;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Course java = new Course("Programowanie obiektowe", 3);
        Course math = new Course("Analiza matematyczna");

        Student anna = new Student("Anna Kowalska", "123456");
        Student jan = new Student("Jan Nowak", 42);

        System.out.println("enroll(anna):          " + java.enroll(anna));
        System.out.println("enroll(anna) ponownie: " + java.enroll(anna));
        System.out.println("enroll(name, album):   " + java.enroll("Maria Wiśniewska", "654321"));
        System.out.println("enroll(jan, piotr):    dodano "
                + java.enroll(jan, new Student("Piotr Zieliński", "111111")));

        System.out.println(java + " -> " + Arrays.toString(java.getStudents()));
        System.out.println(math);
        System.out.println("Utworzonych kursów: " + Course.getNumberOfCreatedCourses());

        java.getStudents()[0] = null;
        System.out.println("Po próbie modyfikacji kopii: " + Arrays.toString(java.getStudents()));
    }
}
