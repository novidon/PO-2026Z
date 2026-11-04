package zoo;

public class GuideDog extends Dog {

    public GuideDog() {
        this("Luna");
    }

    public GuideDog(String name) {
        super(name);
    }

    public void guide() {
        System.out.println(getName() + " prowadzi swojego opiekuna.");
    }
}
