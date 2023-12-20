package interview2023.java;

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeCheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number!");
        int input  = sc.nextInt();

//        static <T> Stream<T> iterate(T seed,
//                Predicate<? super T> hasNext,
//                UnaryOperator<T> next)

        int result = IntStream.iterate(input, n -> n != 0, i -> i / 10)
                .map(n -> n % 10)
                .reduce(0, (a, b) -> a * 10 + b);
        if (input == result){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

        System.out.println("Enter number!");
        String inputString  = sc.nextLine();
        String temp  = inputString.replaceAll("\\s+", "").toLowerCase();
        boolean resultValue = IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
        System.out.println("Is given string Palindrome? -> " + resultValue);

    }

}
