package certification.java11.innerclasses;

public class StaticInnerClass {
    static class Student {
        String name;
        Student(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Student student = new Student("name");
    }
}
