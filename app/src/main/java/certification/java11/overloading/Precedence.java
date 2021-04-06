package certification.java11.overloading;

public class Precedence {
    static void print(int... nums) { System.out.println("int..."); }
    static void print(long a, long b) { System.out.println("long, long"); }
    static void print(Integer a, Integer b) { System.out.println("Integer, Integer"); }

    static void analyze(Object o) { System.out.println("I'm an object"); }
    static void analyze(long[] arr) { System.out.println("I'm an array"); }

    public static void main(String[] args) {
        int b = 12;
        // prints long, long
        // precedence order: primitive widening > boxing > varargs
        print(b, b);

        int[] nums = new int[4];
        // prints: I'm an object
        analyze(nums);
    }
}
