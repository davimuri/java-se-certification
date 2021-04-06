package certification.java11.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizePath {
    public static void main(String[] args) {
        String originalPath = "data\\projects\\project1\\..\\..\\project2";
        Path path = Paths.get(originalPath);

        // prints data\projects\project1\..\..\project2
        System.out.println(path.normalize());

        Path path2 = Paths.get("data/projects/project1/../../project2");

        // prints data/project2
        System.out.println(path2.normalize());
    }
}
