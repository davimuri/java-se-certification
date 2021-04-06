package certification.java11.inheritance;

class A {
    public int x = 10;
}
class B extends A {
    public int x = 5;
}
public class InstanveVariable {
    public static void main(String[] args) {
        A objBRefA = new B();
        System.out.println(objBRefA.x); // 10
        B objBRefB = (B)objBRefA;
        System.out.println(objBRefB.x); // 5
    }
}
