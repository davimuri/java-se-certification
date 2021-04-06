package certification.java11.controlflow;

public class ValidTypesInSwitch {
    private static void string(String str) {
    }
    public static void main(String[] args) {
        String str = "A";
        switch (str) {
            case "AB":
                System.out.println("AB");
        }
        var i = 0;
        switch (i) {
            case 2:
                System.out.println("2");
        }
    }
}
