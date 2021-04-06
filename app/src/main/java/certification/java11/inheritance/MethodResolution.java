package certification.java11.inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Foo {
    public void foo(Collection c) {
        System.out.println("Foo Collection");
    }
}
class Bar extends Foo {
    public void foo(Collection c) {
        System.out.println("Bar Collection");
    }
    public void foo(List l) {
        System.out.println("Bar List");
    }
}
public class MethodResolution {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();
        Collection<String> c = new ArrayList<>();
        f1.foo(c); // Foo Collection
        f2.foo(c); // Bar Collection
        b1.foo(c); // Bar Collection

        ArrayList<String> arrayList = new ArrayList<>();
        f1.foo(arrayList); // Foo Collection
        f2.foo(arrayList); // Bar Collection
        b1.foo(arrayList); // Bar List
    }
}
