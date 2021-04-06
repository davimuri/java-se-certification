package certification.java11.varargs;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsAnnotation {
    @SafeVarargs // Not actually safe!
    static void m(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = List.of(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
        System.out.println(s);
    }
    @SafeVarargs
    private static void print(List<String>... args) {
        for (List<String> l : args) {
            System.out.println(l);
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {
        // raw type
        List list = new ArrayList();

        // unchecked operations
        list.add("A");
        list.add("B");

        print(list);
        m(list);
    }
}
