package certification.java11.innerclasses;

public class NonStaticInnerClass {
    class Greeting {
        void sayHi() {
            System.out.println("Hello world");
        }
    }
    public static void main(String[] args) {
        NonStaticInnerClass obj = new NonStaticInnerClass();
        NonStaticInnerClass.Greeting greeting = obj.new Greeting();
        greeting.sayHi();
    }
}
