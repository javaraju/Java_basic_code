package interview2023.java.LambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingTest {

    public static void main(String[] args) {

        String[] mobiles = {"Samsung", "Lenovo", "Xiaomi", "Oppo", "Apple", "Sony", "Blackberry"};

        System.out.println("************* Using Anonymous Inner class ***************");


        Arrays.sort(mobiles, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        //Using Arrays.stream to covert in Stream
        Arrays.stream(mobiles).forEach(System.out::println);
        System.out.println("************* Using Lambda Expression *******************");

        Arrays.sort(mobiles, (s1, s2) -> s1.compareTo(s2));
        //or using method refrence

//          Arrays.sort(mobiles, String::compareTo);

        //Using Stream.of to covert in Stream
        Stream.of(mobiles).forEach(System.out::println);

        List<String> s = Arrays.stream(mobiles).sorted((a1, a2) -> a1.compareTo(a2)).collect(Collectors.toList());
        System.out.println(s);
        List<String> s1 = Arrays.stream(mobiles).sorted((a1, a2) -> -a1.compareTo(a2)).collect(Collectors.toList());
        System.out.println(s);
        List<String> s2 = Arrays.stream(mobiles).sorted().collect(Collectors.toList());
        System.out.println(s);
        List<String> s3 = Arrays.stream(mobiles).sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(s);
    }

}