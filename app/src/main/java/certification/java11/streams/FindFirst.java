package certification.java11.streams;

import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        var fruits = List.of("Banana", "Mango", "Apple", "Orange");
        Optional<String> optional = fruits.stream().filter(f -> f.contains("n")).findFirst();
    }
}
