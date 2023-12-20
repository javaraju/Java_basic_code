package interview2023.java.StreamJoining;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
// Class
public class JoiningChar {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating a custom character array
        char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o',
                      'r', 'G', 'e', 'e', 'k', 's' };
 
        // Converting character array into string
        // using joining() method of Collectors class
        String chString
            = Stream.of(ch)
                  .map(arr -> new String(arr))
                  .collect(Collectors.joining());
//        String chString
//                = Stream.of(ch)
//                .map(arr -> String.valueOf(arr))
//                .collect(Collectors.joining());

        // Printing concatenated string
        System.out.println(chString);
    }
}