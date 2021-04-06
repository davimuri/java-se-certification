package certification.java11.streams;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        var list = List.of("4.5", "6.6");
        BinaryOperator<Double> bo = (a, b) -> a+b;
        double total1 = list.stream().map(Double::parseDouble).reduce(0.0, bo);
        double total2 = list.stream().mapToDouble(Double::parseDouble).sum();
        System.out.printf("total1: %f%n", total1);
        System.out.printf("total2: %f%n", total2);
    }

}
