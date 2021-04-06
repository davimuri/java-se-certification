package certification.java11.controlflow;

public class ContinueInsideSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            switch (i % 5) {
                case 2:
                    i *= i;
                    break;
                case 3:
                    i++;
                    break;
                case 1:
                case 4:
                    i++;
                    continue;
                default:
                    break;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
