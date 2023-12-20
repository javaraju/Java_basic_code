package Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice01 {
    public static void main(String args[]) {
        List<Integer> myList = List.of(10, 15, 8, 49, 25, 98, 32);
        myList.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

        findElementStartWithOne(myList);
        findDuplicateElementFromList();
        findFirstElement(myList);
        totalNumberOfElement(myList);
        findMaxElement(myList);
//        findNonRepeatedCharacter(myList);
//        findTheFirstRepeatedCharacter(myList);
    }

    private static void  findElementStartWithOne(List<Integer> myList) {

        List<Integer> listResult = myList.stream().map(String::valueOf).filter(e-> e.startsWith("1"))
                .map(Integer::valueOf).collect(Collectors.toList());
        System.out.println("findElementStartWithOne => " + listResult);
    }
    private static void findDuplicateElementFromList() {

        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> duplicateElementList1 = list.stream().filter(e-> Collections.frequency(list, e)>1).map(e->e)
                .collect(Collectors.toSet());
        System.out.println("findDuplicateElementFromList1 => " + duplicateElementList1);

        List<Integer> duplicateElementList2 = list.stream().collect(Collectors.groupingBy(e->e)).entrySet().stream()
                .filter(e-> e.getValue().size()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("findDuplicateElementFromList2 => " + duplicateElementList2);
        List<Integer> duplicateElementList3 = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("findDuplicateElementFromList3 => " + duplicateElementList3);

        Map<Integer, Long> duplicateElementList4 = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("findDuplicateElementFromList4 =>" + duplicateElementList4);


    }

    private static void findFirstElement(List<Integer> myList) {
        Integer firstElement = myList.stream().findFirst().get();
        System.out.println("findFirstElement => " + firstElement);
    }

    private static void totalNumberOfElement(List<Integer> myList) {
        Long count = myList.stream().count();
        System.out.println("totalNumberOfElement => " + count);
    }

    private static void findMaxElement(List<Integer> myList) {
        Integer max = myList.stream().mapToInt(e->e).max().getAsInt();
        Integer max1 = myList.stream().max(Integer::compare).get();
        System.out.println("findMaxElement => " + max);
        System.out.println("findMaxElement1 => " + max1);

    }

}
