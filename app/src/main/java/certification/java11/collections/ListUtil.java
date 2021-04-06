package certification.java11.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListUtil {

    private static void replaceAll() {
        UnaryOperator<String> operator = String::toUpperCase;
        var fruits = new ArrayList<String>(List.of("mango"));
        fruits.replaceAll(operator);
        System.out.println(fruits);
    }

    public static void main(String[] args) {
        var collection = new HashSet<>();
        //var collection = Arrays.asList(1,2,3);
        collection.add(1);
        var list1 = List.of(collection);
        collection.add(2);
        var list2 = List.copyOf(collection);
        System.out.println(list1);
        System.out.println(list2);
        replaceAll();
    }
}
