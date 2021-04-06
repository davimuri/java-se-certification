package certification.java11.lambdas;

import java.util.List;
import java.util.stream.Stream;

public class Casting {
    static class Widget {
        String name;
        double price;
        Widget(String name, double price) {
            this.name = name;
            this.price = price;
        }
        double getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        List widgets = List.of(
                new Widget("Basic", 19.55),
                new Widget("Enhanced", 22.55)
        );

        Stream stream = widgets.stream();
        stream.filter(w -> ((Widget)w).getPrice() > 20.00)
                .forEach(System.out::println);

        Stream<Widget> stream2 = widgets.stream();
        stream2.filter(w -> w.getPrice() > 20.00)
                .forEach(System.out::println);

        // compile error: incompatible types for w parameter in predicate
        /*
        stream = widgets.stream();
        stream.filter((Widget w) -> w.getPrice() > 20.00)
                .forEach(System.out::println);
         */

    }
}
