package interview2023.java.StreamJoining;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTestsDemo {
   public static void main(String[] args) {

       //Sum of all integer
       List<Integer> list = Arrays.asList(1,4,3);
       Optional<Integer> sumOfAllInteger = list.stream().reduce((a,b) -> a+b);
       System.out.println(sumOfAllInteger.get());

       // Average of all integer
       double averageValue = list.stream().mapToInt(e->e).average().getAsDouble();
       System.out.println(averageValue);

       //Max value
       double maxValue = list.stream().mapToInt(e->e).max().getAsInt();
       System.out.println(maxValue);

       // Square and filter
               List<Integer> numbersForSquare = Arrays.asList(1,10,20,30,15);
       List<Integer> squareOfNumbers = numbersForSquare.stream().mapToInt(e->e*e).boxed().collect(Collectors.toList()).stream().filter(i-> i >100).collect(Collectors.toList());
       System.out.println(squareOfNumbers);
       System.out.println( numbersForSquare.stream().mapToInt(e->e*e).filter(i-> i >100).boxed().collect(Collectors.toList()));
       List<Integer> getDataMoreThanHundred = squareOfNumbers.stream().filter(i -> i > 100).collect(Collectors.toList());
       System.out.println(getDataMoreThanHundred);


       //Odd numbers and even numbers
       List<Integer> listOfNumbers = Arrays.asList(2,11,24,12,43,26,17,56,18,33,37);
       List<Integer> evenNumbers = listOfNumbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
       System.out.println(evenNumbers);

       List<Integer> oddNumbers = listOfNumbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
       System.out.println(oddNumbers);

       //Print the Number starts with prefix 2
       List<String> getStartsWithTwoListOfString = Arrays.asList("2","222","432","321","567","890","234","211","22","332","12","21");
       List<String> startsWithTwoListOfString = getStartsWithTwoListOfString.stream().filter(s -> s.startsWith("2")).collect(Collectors.toList());
       System.out.println(startsWithTwoListOfString);

       List<Integer> getStartsWithTwoListInt = Arrays.asList(2,222,432,321,567,890,234,211,22,332,12,21);
       List<Integer> listOfIntegerStrtsWithTwo =  getStartsWithTwoListInt.stream().map(e -> String.valueOf(e)).filter(s -> s.startsWith("2"))
               .map(Integer:: valueOf)
               .collect(Collectors.toList());

       System.out.println(listOfIntegerStrtsWithTwo);


       //Duplicate Numbers Step 1
       String input = "abbcdeef";
       List<Character> characterList = input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch-> ch))
               .entrySet()
               .stream().filter(entry -> entry.getValue().size() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());

       System.out.println(characterList);

       int[] a = {1,2,2,1,3,4,5};

       List<Integer> integerListList = Arrays.stream(a).boxed().collect(Collectors.groupingBy(i -> i)).entrySet().
               stream().filter(e -> e.getValue().size() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
       System.out.println(integerListList);

       // Distinct Integer
       List<Integer> distinctInteger = Arrays.stream(a).distinct().boxed().collect(Collectors.toList());
       System.out.println(distinctInteger);

       //Duplicate Numbers Step 2
       List<Integer> listOfInteger = Arrays.asList(1,3,12,22,1,2,3,34,5,6,7,22);
       Set<Integer> dupList =  listOfInteger.stream().filter(e -> Collections.frequency(listOfInteger,e) > 1).collect(Collectors.toSet());
       System.out.println(dupList);


       //Find a Max number and min number
       List<Integer> listOfIntValues = Arrays.asList(11,3,5,10,30,25,334,11,2,12,2,2,19,3);
       int maxNumber = listOfIntValues.stream().max(Comparator.comparing(Integer::valueOf)).get();
       int minNumber = listOfIntValues.stream().min(Comparator.comparing(Integer::valueOf)).get();

       System.out.println("Max value -> "+maxNumber);
       System.out.println("Min value -> "+minNumber);


       //Sort the numbers
       List<Integer> sortingValues = Arrays.asList(9,8,7,6,22,12,10,3,1,43);
       List<Integer> sortedValue = sortingValues.stream().sorted().collect(Collectors.toList());
       System.out.println(sortedValue);

       List<Integer> sdescendingOrder = sortingValues.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
       System.out.println(sdescendingOrder);


       // Limit 5 from list
       List<Integer> limitLists = Arrays.asList(9,8,7,6,22,12,10,3,1,43);
       List<Integer> initial5Vlaue = limitLists.stream().limit(5).collect(Collectors.toList());
       System.out.println(initial5Vlaue);

       //Sum of first five
       int sum = limitLists.stream().limit(5).reduce((p,q) -> p+q).get();
       System.out.println(sum);

       //Get the first non repeating character
       String name = "RaajuRaanu";
       name = name.toLowerCase();

       Optional<Character> chValue = name.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch-> ch))
               .entrySet()
               .stream().filter(entry -> entry.getValue().size() == 1).map(entry -> entry.getKey()).findFirst();
       System.out.println(chValue.get());


       //Get 2 hiest and lowest number

       //Highest value
       List<Integer> checkLists = Arrays.asList(9,8,7,6,22,12,10,3,1,43);
       int secndHisgestValue = checkLists.stream().sorted(Collections.reverseOrder()).
               distinct().limit(2).skip(1).findFirst().get();
       System.out.println(secndHisgestValue);

       //Lowest
       int secndLowestValue = checkLists.stream().sorted().
               distinct().skip(1).findFirst().get();
       System.out.println(secndLowestValue);


   }
}
