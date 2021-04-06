package certification.java11.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingCache {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<Integer>();

        testList.add(127);
        testList.add(127);

        testList.add(128);
        testList.add(128);

        // When we use autoboxing valueOf is implemented such that certain numbers are "pooled",
        // and it returns the same instance for values smaller than 128. Autoboxing caches -128 to 127.
        System.out.println(testList.get(0) == testList.get(1)); // true
        System.out.println(testList.get(2) == testList.get(3)); // false
    }
}
