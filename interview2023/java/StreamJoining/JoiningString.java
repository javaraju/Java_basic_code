package interview2023.java.StreamJoining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningString {
    public static void main(String[] args)
    {
        // Create a string list
        List<String> str = Arrays.asList("Geeks", "for", "Geeks");
 
        // Convert the string list into String
        // using Collectors.joining() method
        String chString
            = str.stream().collect(Collectors.joining());
 
        // Print the concatenated String
        System.out.println("result-1 "+ chString);

        List<String> letters = Arrays.asList("j", "a", "v", "a", "t", "e", "c", "h", "o", "n", "l", "i", "n", "e");
        String result = letters .stream()
                .reduce(" ", (partialString, element) -> partialString + element);
        System.out.println("result-2 " + result);
        String result1 = letters .stream().reduce(" ", String::concat);
        System.out.println("result-3 " + result1);
    }
}