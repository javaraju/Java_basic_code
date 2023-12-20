package interview2023.java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciStreamProgram {

    public static List < Integer > fibonacci(int limit) {

        return Stream.iterate(new int[] {0, 1}, t -> new int[] {t[1], t[0] + t[1]})
            .limit(limit)
            .map(n -> n[0])
            .collect(Collectors.toList());

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = scanner.nextInt();

        System.out.println(fibonacci(n) + "\t");

        scanner.close();
    }
}