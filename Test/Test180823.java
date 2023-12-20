package Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test180823 {

    public static void main(String[] args) {

        int input = 8;

        List<String> list = Arrays.asList("Zpple", "a", "mang");

        //Length sorting order
        list.stream().sorted((a,b)->b.length()-a.length()).findFirst().ifPresent(System.out::println);
        //Alphabetic sorting
        list.stream().sorted(String::compareTo).findFirst().ifPresent(System.out::println);
        //length sorting order
        list.stream().min((a, b) -> b.length() - a.length()).ifPresent(System.out::println);

        //check even or odd
        isEven(input);



        //make first char as upper case in string
        List<String> l = list.stream().map(name -> Character.toUpperCase(name.charAt(0)) + name.substring(1))
                .collect(Collectors.toList());
        l.stream().forEach(System.out::println);

        String str = "how are you";
        String s = Arrays.stream(str.split(" "))
                .map(strg -> strg.substring(0, 1).
                        toUpperCase() + strg.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(s);






    }

    private static void isEven(int input){


        Predicate<Integer> data = (number) -> number % 2 == 0;
        System.out.println(data.test(input));

    }


}
