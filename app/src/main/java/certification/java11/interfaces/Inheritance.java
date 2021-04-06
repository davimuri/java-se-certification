package certification.java11.interfaces;

interface Black {
    default void getColor(){
        System.out.print("Black");
    }
}
interface Red extends Black {
    default void getColor(){
        System.out.print("Red");
    }
}
interface Gold {
    static void getColor(){
        System.out.print("Gold");
    }
}
public class Inheritance implements Black, Red, Gold {
    public static void main(String[] args) {
        Inheritance colors = new Inheritance();
        colors.getColor(); // prints Red
    }
}
