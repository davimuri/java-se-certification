package certification.java11.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingByNullableField {
    static class Employee {
        String name;
        String department;

        Employee(String n, String d) {
            name = n;
            department = d;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Peter", "HR"),
                new Employee("Alf", "Logistics"),
                new Employee("Donald", "HR"),
                new Employee("Neo", "IT"),
                new Employee("Mr", null)
        );
        Map<Optional<String>, List<String>> groups = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                e -> Optional.ofNullable(e.getDepartment()),
                                Collectors.mapping(Employee::getName, Collectors.toList())
                        )
                );
        System.out.println(groups);
    }
}
