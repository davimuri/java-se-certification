package certification.java11.interfaces;

interface Bird {
    default String fly() {
        return "fly";
    }
}

interface Parrot extends Bird {
    public String fly();
}

public class DefaultMethod implements Parrot {
    public static void main(String[] args) {
        Bird b = new DefaultMethod();
        System.out.println(b.fly());
    }

    // This override is required because Parrot interface made
    // the fly method abstract.
    @Override
    public String fly() {
        return "Override";
    }
}
