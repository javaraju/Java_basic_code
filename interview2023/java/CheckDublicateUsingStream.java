package interview2023.java;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckDublicateUsingStream {
    public static Set<Integer> findDuplicateInStream(Stream<Integer> stream)
    {
        Set<Integer> items = new HashSet<>();
        return stream.filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }
    public static void main(String[] args)
    {
        Stream<Integer> stream
                = Stream.of(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34);
        System.out.println(findDuplicateInStream(stream));
    }
}
