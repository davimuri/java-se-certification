package certification.java11.streams;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {

        var ls = Arrays.asList(
                new Student("S1", Student.Grade.A),
                new Student("S2", Student.Grade.A),
                new Student("S3", Student.Grade.B),
                new Student("S4", Student.Grade.C),
                new Student("S5", Student.Grade.F));

        var group = ls.stream()
                .filter(student -> student.getGrade() != Student.Grade.F)
                .collect(Collectors.groupingBy(Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(group);

        Predicate<Student> isAGrade = s -> s.getGrade() == Student.Grade.A;
        var studentNamesWithGradeA = ls.stream()
                .collect(Collectors.partitioningBy(isAGrade))
                .get(true)
                .stream()
                .map(Student::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(studentNamesWithGradeA);

    }
}

class Student {
    public static enum Grade {A, B, C, D, F}
    private String name;
    private Grade grade;
    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }
    public String toString() {
        return name + ":" + grade;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
