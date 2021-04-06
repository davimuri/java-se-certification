package certification.java11.varargs;

import java.util.Arrays;

public class NullAndEmptyVarArgs {
    public static void greet(String... args) {
        System.out.println("length " + args.length);
        System.out.println(Arrays.toString(args));
    }
    public static void main(String[] args) {
        NullAndEmptyVarArgs t = null;

        // NullPointerException because of arr
        String[] arr = null;
        t.greet(arr);

        // Works:
        // an empty array is created as argument
        // t is null but the method is static
        t.greet();
    }
}
