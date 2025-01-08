package pro.shamilabd.easy;

import java.util.List;
import java.util.function.Predicate;

public class LambdaEx {

    public static void main(String[] args) {
        List<String> list = List.of("foo", "bar", "baz", "zum");
        Predicate<String> containA = (t) -> t.contains("a");
        var listWithA = list.stream()
                            .filter(containA)
                            .toList();
        System.out.println(list);
        System.out.println(listWithA);
    }

}
