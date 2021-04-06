package certification.java11.lambdas;

import java.util.Locale;

interface Interface1 {
    public int method() throws Exception;
    private void pMethod() {}
}
interface Interface2 {
    public static void sMethod() {}
    public boolean equals();
}
interface Interface3 {
    public void method();
    public void method(String str);
}
interface Interface4 {
    // compile error: should have default modifier
    //public void dMethod() {}
    public void method();
}
interface Interface5 {
    // compile error: static method should have a body
    //public static void sMethod();
    public void method(String str);
}
public class ValidInterfaces {
    public static void main(String[] args) {
        Interface1 lambda1 = () -> 6;
        Interface2 lambda2 = () -> true;
        // compile error
        //Interface3 lambda3 = str -> str.toLowerCase();
    }
}
