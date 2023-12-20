package interview2023.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcatenation {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("D", "E", "M", "O");
        String joined = list.stream()
                .collect(Collectors.joining(""));
        System.out.println(joined);

    }
}
