package certification.java11.collections;

import java.util.ArrayList;

public class AddElementAtPosition {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        // IndexOutOfBoundsException (same with set() method)
        list.add(3, 4);

        System.out.println(list);
    }
}
