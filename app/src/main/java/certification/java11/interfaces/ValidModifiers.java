package certification.java11.interfaces;

interface MyInterface {
    int i = 0;
    public static final int a = 2;


    public static void publicStatic() { }
    static void m6() {}
    private static void m2() {}

    private void m1() { }

    public default void m3() { }

    public void mpub();
    public abstract void m4();
    void m5();
}
public class ValidModifiers implements MyInterface {
    @Override
    public void mpub() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }
    public static void main(String[] args) {
        ValidModifiers obj = new ValidModifiers();
        obj.m3();
    }
}
