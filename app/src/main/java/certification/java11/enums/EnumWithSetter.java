package certification.java11.enums;

enum Setter {
    ONE(1), TWO(2);

    private int val;

    Setter(int v) {
        val = v;
    }

    public void setValue(int v) {
        val = v;
    }

    public int getValue() {
        return val;
    }
}

public class EnumWithSetter {
    public static void main(String[] args) {
        Setter setter = Setter.ONE;
        System.out.printf("initial value %d%n", setter.getValue());
        setter.setValue(3);
        System.out.printf("after setter value %d%n", setter.getValue());
    }
}
