package certification.java11.oo;

public class ObjectReferences {
    private static void dereference(Object obj) {
        obj = null;
    }
    public static void main(String[] args) {
        Object myObj = new Object();
        dereference(myObj);
        System.out.println(myObj);
    }
}
