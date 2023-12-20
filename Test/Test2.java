package Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
// List<String> list = List.of("cat", "dog", "cat", "cat", "dog", "tiger", "lion", "lion", "tiger");
        String s = "cat dog cat cat dog tiger lion lion tiger";
        String[] s1 = s.split(" ");
        Map<String, Long> map = Arrays.stream(s1).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map);
    }



    //    (Name, mobile, country). —> index
//    Which of the below queries would satisfy above index:
//            1. Select * from products where country = ? And mobile = ? And name = ? ()
//            2. Select * from products where name = ? And country = ? ()
//            3. Select * from products where name = ? And mobile = ? ()
//            4. Select * from products where name = ? And mobile = ? And country = ? ()
//            5. Select * from products where mobile = ? And country = ? ()
//            6. Select * from products where country = ? And name = ? And mobile = ?()
//    A Srikanth Varma3:33 PM
//    Height of N pillars is int Arr[N]. Find the total height of the water trapped in rainfall.
//
//    Ex: height of pillars = [0, 1, 0, 3, 1, 0, 2, 0, 0, 2, 0]
//    A Srikanth Varma3:38 PM
//    Given an array Arr[N]. Rotate the array by K units in the clock wise direction
//    Lets consider an array a[6] = [1, 2, 3, 4, 5, 6] and k = 3
//    You3:41 PM
//[4,5,6,1,2,3]
}