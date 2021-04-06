package certification.java11.generics;

class CustomType<T> { // This generic type T is different than the one in the count method
    public <T> int count(T[] array, T element) {
        int count = 0;
        for (T e : array) {
            if (e.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        String[] words = {"banana", "orange", "apple"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        CustomType rawType = new CustomType();
        CustomType<String> stringType = new CustomType<>();
        System.out.println(stringType.count(words, "apple"));
        //System.out.println(stringType.count(numbers, 3));
        System.out.println(rawType.count(words, "apple"));
        System.out.println(rawType.count(numbers, 3));
    }
}
