package certification.java11.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class OverridingMethods {
    static class Superclass {
        public List<Integer> getCollection() { return new ArrayList<Integer>(); }
        public <T> Collection<T> foo(Collection<T> arg) { return null; }
    }
    static class Subclass1 extends Superclass {
        // compilation error: incompatible return type
        //public List<? super Integer> getCollection() { return new ArrayList<Integer>(); }

        // compilation error: incompatible return type
        //public List<? extends Integer> getCollection() { return new ArrayList<Integer>(); }

        public ArrayList<Integer> getCollection() { return new ArrayList<Integer>(); }

        // overloading
        public <T> Collection<T> foo(Stream<T> arg) { return null; }
    }
}
