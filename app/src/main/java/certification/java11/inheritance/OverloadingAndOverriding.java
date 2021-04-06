package certification.java11.inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Foo2 {
    public List<Number> foo(Set<CharSequence> m) {
        System.out.println("Foo2");
        return null;
    }
}

public class OverloadingAndOverriding extends Foo2 {
    public List<Integer> foo(TreeSet<String> m) {
        System.out.println("OverloadingAndOverriding");
        return null;
    }
    public static void main(String[] args) {
        OverloadingAndOverriding obj = new OverloadingAndOverriding();
        obj.foo(new HashSet<>());
        obj.foo(new TreeSet<String>());
    }
}
