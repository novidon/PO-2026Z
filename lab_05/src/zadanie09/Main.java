package zadanie09;

public class Main {

    public static void main(String[] args) {
        Parent object = new Child();

        System.out.println(object.value);
        System.out.println(object.getValue());

        System.out.println(((Child) object).value);
    }
}
