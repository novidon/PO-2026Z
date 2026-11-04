package dodatkowe;

public class Main {

    public static void main(String[] args) {
        Rectangle first = new Rectangle(2, 3);
        Rectangle sameObject = first;
        Rectangle copy = new Rectangle(first);

        first.scale(2);

        first.showInformation("first     ");
        sameObject.showInformation("sameObject");
        copy.showInformation("copy      ");

        System.out.println("first == sameObject: " + (first == sameObject));
        System.out.println("first == copy:       " + (first == copy));

        new Rectangle().showInformation("Rectangle()   ");
        new Rectangle(5).showInformation("Rectangle(5)  ");
    }
}
