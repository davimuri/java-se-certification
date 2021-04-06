package certification.java11.inheritance;

class ConSuper {
    protected ConSuper() {
        this(2);
        System.out.println("1");
    }
    protected ConSuper(int a) {
        System.out.println(a);
    }
}
class ConSub extends ConSuper {
    ConSub() {
        this(4);
        System.out.println("3");
    }
    ConSub(int a) {
        System.out.println(a);
    }
}
public class Constructors {
    public static void main(String[] args) {
        new ConSub(4);
    }
}
