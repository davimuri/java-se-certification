package certification.java11.controlflow;

public class SwitchWithConstantExpression {
    public static void main(String[] args) {
        int b = 'a' | 'b';
        switch (b) {
            case 'b':
                System.out.println("case b");
                break;
            case 'a':
                System.out.println("case a");
                break;
            case 'a' | 'b':
                System.out.println("case a | b");
                break;
            default:
                System.out.println("default");
        }
    }
}
