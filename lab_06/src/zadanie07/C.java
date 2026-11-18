package zadanie07;

public class C implements A, B {

    // Without this override javac fails with:
    // types A and B are incompatible; class C inherits unrelated defaults for hello() from types A and B
    @Override
    public void hello() {
        A.super.hello();
        B.super.hello();
        System.out.println("Hello z C");
    }
}
