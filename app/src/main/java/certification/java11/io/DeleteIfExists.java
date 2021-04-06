package certification.java11.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteIfExists {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/file/doesnt/exist.txt");
            boolean deleted = Files.deleteIfExists(path);
            System.out.println(deleted);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
