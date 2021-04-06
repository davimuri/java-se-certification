package certification.java11.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Comparing {
    static class Person {
        int age;
        String name;
        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
        int getAge() {
            return age;
        }
        String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person(44, "Tom"),
                new Person(40, "Aman"),
                new Person(40, "Peter")
        ));
        people.sort(
                Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getName)
                        .reversed()
        );
        people.forEach(p -> System.out.print("" + p.getName()));

    }
}
