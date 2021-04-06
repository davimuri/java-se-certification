package certification.java11.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterParallel {
    public static void main(String[] args) {
        List<String> longList = List.of("Hello", "World", "Beat");
        List<String> shortList = new ArrayList<>();
        longList.stream()
                .filter(w -> w.indexOf('e') != -1)
                .forEach(shortList::add);
        System.out.println(shortList);

        List<String> shortList2 = new ArrayList<>();
        longList.stream()
                .filter(w -> w.indexOf('e') != -1)
                .parallel()
                .forEach(shortList2::add);
        System.out.println(shortList2);

        List<String> shortList3 = longList.stream()
                .filter(w -> w.indexOf('e') != -1)
                .parallel()
                .collect(Collectors.toList());
        System.out.println(shortList3);

    }
}
