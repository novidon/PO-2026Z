package zadanie06;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.println("Cześć, mam na imię " + name);
    }
}
