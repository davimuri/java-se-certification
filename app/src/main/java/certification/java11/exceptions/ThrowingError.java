package certification.java11.exceptions;

import java.io.File;

public class ThrowingError {
    public static void checkConfig(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            throw new Error("Fatal error. File " + filename + " is missing");
        }
    }
    public static void main(String[] args) {
        checkConfig("app.config");
        System.out.println("Config is ok");
    }
}
