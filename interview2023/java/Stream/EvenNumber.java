package interview2023.java.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String args[]) {
        List<Integer> myList = List.of(10, 15, 8, 49, 25, 98, 32);
        myList.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

        findElementStartWithOne();
        findDuplicateElementFromList();
        findFirstElement();
        totalNumberOfElement();
        findMaxElement();
        findNonRepeatedCharacter();
        findTheFirstRepeatedCharacter();
    }

    public static void findElementStartWithOne() {
        List<Integer> list = List.of(10, 15, 8, 49, 25, 98, 32);
        List<Integer> result = list.stream().map(String::valueOf).filter(data -> data.startsWith("1")).map(Integer::valueOf).collect(Collectors.toList());

        System.out.println("elements start with 1 are :-->  " + result);
    }

    public static void findDuplicateElementFromList() {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        List<Integer> result = list.stream().filter(e -> !set.add(e)).collect(Collectors.toList());
        Set<Integer> result1 = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println("DuplicateElementFromList results are --> " + result);
        System.out.println("DuplicateElementFromList results1 are --> " + result1);
    }

    public static void findFirstElement() {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList.stream().findFirst().ifPresent(System.out::println);
    }

    public static void totalNumberOfElement() {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        long count = myList.stream().count();
        System.out.println("Total count is -->" + count);
    }
    public static void findMaxElement(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max = myList.stream().max(Integer::compare).get();
        System.out.println("Max element is -> " + max);
    }

    public static void findNonRepeatedCharacter(){

        String input = "Java Hungry Blog Alive is Awesome";

        Character result = input.chars() // Stream of String
                .mapToObj(s -> (char)Character.toLowerCase(s)) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

       Map<Character , Long> data =  input.chars() // Stream of String
                .mapToObj(s -> (char)Character.toLowerCase( s)) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
               .entrySet().stream().filter(e->e.getValue()>1 && !e.getKey().toString().isBlank())
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(data);
    }

    public static void  findTheFirstRepeatedCharacter(){
        String input = " Java Hungry Blog Alive is Awesome";

        Character result = input.chars().mapToObj(c-> Character.toLowerCase(Character.valueOf((char)c)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
                .filter(e-> e.getValue()>1 && !e.getKey().toString().isBlank()).map(e-> e.getKey()).findFirst().get();

        System.out.println("First Repeated character is --> "+ result);
    }

}
