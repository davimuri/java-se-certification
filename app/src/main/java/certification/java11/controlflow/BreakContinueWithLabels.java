package certification.java11.controlflow;

public class BreakContinueWithLabels {
    public static void main(String[] args) {
        int i;
        outer:
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break outer;
                }
            }
        } while (true);

        label1:
        for (int j = 0; j < 3; j++) {
            label2:
            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 3; l++) {
                    System.out.printf("j: %d, k: %d, l: %d%n", j, k, l);
                    if (l == 1) {
                        break label2;
                    }
                }
            }
            System.out.println("---");
        }
    }
}
