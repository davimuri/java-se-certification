package certification.java11.strings;

public class StringBuilderConcat {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Certification ");
        String s = sb.toString() + sb.append("Guide ");
        System.out.println(s.strip().length());
        System.out.println(sb);
    }
}
