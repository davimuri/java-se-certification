package certification.java11.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Sale {
    String customer;
    List<Book> items;

    public String getCustomer() {
        return customer;
    }

    public List<Book> getItems() {
        return items;
    }
}
class Book {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
public class TotalSalesPerCustomer {
    public static void main(String[] args) {
        List<String> res1 = getSales().stream()
                .collect(
                        Collectors.groupingBy(
                                Sale::getCustomer,
                                Collectors.flatMapping(
                                        s -> s.getItems().stream(),
                                        Collectors.summingDouble(Book::getPrice)
                                )
                        )
                )
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(
                        Collectors.mapping(
                                e -> e.getKey() + ": " + e.getValue(),
                                Collectors.toList()
                        )
                );
        System.out.printf("Approach 1: %s%n", res1);
        List<String> res2 = getSales().stream()
                .collect(
                        Collectors.groupingBy(
                                Sale::getCustomer,
                                Collectors.flatMapping(
                                        s -> s.getItems().stream(),
                                        Collectors.summingDouble(Book::getPrice)
                                )
                        )
                )
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(e -> e.getKey() + ": " + e.getValue())
                .collect(Collectors.toList());
        System.out.printf("Approach 2: %s%n", res2);
    }
    private static List<Sale> getSales() {
        Book b1 = new Book();
        b1.name = "Book 1";
        b1.price = 10.99;
        Book b2 = new Book();
        b2.name = "Book 2";
        b2.price = 27.99;
        Book b3 = new Book();
        b3.name = "Book 3";
        b3.price = 30.99;

        Sale s1 = new Sale();
        s1.customer = "Pete";
        s1.items = List.of(b1);
        Sale s1b = new Sale();
        s1b.customer = "Pete";
        s1b.items = List.of(b1);
        Sale s2 = new Sale();
        s2.customer = "Alf";
        s2.items = List.of(b2, b1);
        Sale s3 = new Sale();
        s3.customer = "Donald";
        s3.items = List.of(b2, b3, b1);

        return List.of(s1, s1b, s2, s3);
    }
}
