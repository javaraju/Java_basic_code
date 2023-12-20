package interview2023.java.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestValue {
    public static void main(String[] args) {
        Integer[] arr = {20,3,40,6,5,11,21};
        List<Integer> listArray = Arrays.asList(20,3,40,6,5,11,21);
        List<String> listOfString = Arrays.asList("20","3","40","6","5","11","21");
        Integer secondHighestValue1 = Stream.of(arr).sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secondHighestValue1);
        Integer firstHighestValue1 = Arrays.stream(arr).sorted(Collections.reverseOrder()).distinct().findFirst().get();
        System.out.println(firstHighestValue1);
        Integer secondHighestValue2 = listArray.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        Integer firstHighestValue2 = listArray.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
        System.out.println(secondHighestValue2);
        System.out.println(firstHighestValue2);
        Integer secondHighestValue3 = listOfString.stream().map(Integer::valueOf).sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println("secondHighestValue3->"+ secondHighestValue3);


        //Find second lowest value
        Integer secondLowest = listArray.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        System.out.println("secondLowest->" + secondLowest);

        //Sum of all integer

        List<Integer> sumListInput = Arrays.asList(1,4,3);
        Integer sumOfList = //sumListInput.stream().mapToInt(e->e).sum();
                //sumListInput.stream().map(Integer::valueOf).reduce(0,(a,b)->a+b);
                sumListInput.stream().reduce((a,b)->a+b).get();

        System.out.println("sumOfList ->" + sumOfList);
        List<Integer> getStartsWithTwoListInt = Arrays.asList(2,222,432,321,567,890,234,211,22,332,12,21);
        List<Integer> startWithTwoResult = getStartsWithTwoListInt.stream().map(String::valueOf).filter(e->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println("startWithTwoResult --> "+ startWithTwoResult);
        //FInd average
        Double averageValue = sumListInput.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("averageValue --> " + averageValue);

        //Find duplicate of char
        String input = "abbcdeef";
        List<Character> duplicateList = input.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(e->e))
                .entrySet().stream().filter(entry-> entry.getValue().size()>1)
                .map(entry->entry.getKey()).collect(Collectors.toList());

        System.out.println("duplicateList-> " +duplicateList);
        //Find duplicate of int
        int[] a = {1,2,2,1,3,4,5};
        List<Integer> duplicateListOfInteger = Arrays.stream(a).boxed().collect(Collectors.groupingBy(e->e)).entrySet()
                .stream().filter(entry->entry.getValue().size()>1).map(entry->entry.getKey()).collect(Collectors.toList());
        System.out.println("duplicateListOfInteger---> " + duplicateListOfInteger);
        //Find distinct value
        List<Integer> distinctData = Arrays.stream(a).distinct().boxed().collect(Collectors.toList());
        System.out.println("distinctData--> "+ distinctData);

        //Find duplicate value
        List<Integer> listOfInteger = Arrays.asList(1,3,12,22,1,2,3,34,5,6,7,22);
        Set<Integer> duplicateNumber = listOfInteger.stream().filter(e-> Collections.frequency(listOfInteger,e)>1).collect(Collectors.toSet());
        System.out.println("duplicateNumber --> " +duplicateNumber);

        //Get the first non repeating character
        String name = "RaajuRaanu";
        Character nonRepeatingChar = name.chars().mapToObj(c->(char)Character.toLowerCase(c)).collect(Collectors.groupingBy(ch-> ch))
                .entrySet()
                .stream().filter(entry -> entry.getValue().size() == 1).map(entry -> entry.getKey()).findFirst().get();

        System.out.println("nonRepeatingChar--> "+nonRepeatingChar);

        Map<Character, Long> repeatedCharWithCount = name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("repeatedCharWithCount --> " + repeatedCharWithCount);

      Map<Integer, Long> q = Arrays.stream(a).boxed()
              .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
              .stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("q-->" +q );






    }
}
