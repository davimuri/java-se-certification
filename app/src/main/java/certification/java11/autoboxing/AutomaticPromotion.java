package certification.java11.autoboxing;

public class AutomaticPromotion {
    private static void method(long val) {
        System.out.println("long");
    }
    private static void method(Number val) {
        System.out.println("Number " + val.getClass());
    }

    public static void main(String[] args) {
        method(3.5); // prints Number
        method(1); // prints long
    }
}
