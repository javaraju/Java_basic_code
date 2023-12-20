package interview2023.java.StreamJoining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class GFG2 {
    public static void main(String[] args)
    {
        // Create a string list
        List<String> str = Arrays.asList("Geeks", "for", "Geeks");
 
        // Convert the string list into String
        // using Collectors.joining() method
        String chString = str.stream().collect(Collectors.joining(", ", " {", "} "));
 
        // Print the concatenated String
        System.out.println(chString);
    }
}