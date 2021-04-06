package certification.java11.annotations;

import java.util.function.Function;


@interface My {
}

public class ValidPlaces {
    public static void main(String[] args) {
        Function<String, String> f1 = (@My String x) -> x.toLowerCase();
        Function<String, String> f2 = (@My var x) -> x.toLowerCase();
    }
}
