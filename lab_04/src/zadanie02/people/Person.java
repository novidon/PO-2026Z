package zadanie02.people;

public class Person {

    private String privateField = "private";
    String packagePrivateField = "package-private";
    protected String protectedField = "protected";
    public String publicField = "public";

    public void showFromInside() {
        System.out.println("Person (ta sama klasa): "
                + privateField + ", " + packagePrivateField + ", "
                + protectedField + ", " + publicField);
    }
}
