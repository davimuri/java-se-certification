package certification.java11.exceptions;

import java.util.Arrays;

public class TryCatchFinally {

    private static void method() throws Exception {
        try {
            System.out.println("try block executed");
            throw new Exception("Exception from try");
        } catch (Exception e) {
            System.out.println("catch block executed");
            System.out.println(e.getMessage());
            throw e; // this exception is suppressed because finally blocks throws another exception
        } finally {
            System.out.println("finally block executed");
            throw new Exception("Exception from finally");
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println("catch from main executed");
            System.out.println(e.getMessage()); // Exception from finally
            System.out.printf("Suppressed exception: %s", Arrays.toString(e.getSuppressed()));
        }
    }
}
