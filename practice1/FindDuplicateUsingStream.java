package practice1;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateUsingStream {

    public static void main(String[] args) {
        String s = "Raju kumar Soni raju Kumar soni ranu gupta Sharma";
        String [] stringArray = s.toLowerCase().split(" ");



        Set<String> duplicateElementString =Arrays.stream(stringArray).filter(e -> Collections.frequency(List.of(stringArray),e) > 1)
                .collect(Collectors.toSet());
        System.out.println("Repeated elements are -> " + duplicateElementString);
        List<String> nonRepeatedString = Arrays.stream(stringArray).filter(e-> Collections.frequency(List.of(stringArray), e) == 1)
                .collect(Collectors.toList());
        System.out.println("Non repeated elements are -> " + nonRepeatedString);

        Map<String, Long> repeatedWithCountString = Arrays.stream(stringArray).filter(e-> Collections.frequency(List.of(stringArray), e) > 1)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Repeated With Count -> " + repeatedWithCountString);

        Map<String, Long> elementWithCountString = Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("All element With Count -> " + elementWithCountString);


        Integer [] listOfInteger = new Integer[]{1,23,45,10,4,23,4,4,21,21,21,21};
        Set<Integer> duplicateElementInteger = Arrays.stream(listOfInteger).filter(e->Collections.frequency(List.of(listOfInteger), Integer.valueOf(e)) > 1)
                .collect(Collectors.toSet());
        System.out.println("duplicateElementInteger -> " + duplicateElementInteger);

        List<Integer> nonRepeatedInteger = Arrays.stream(listOfInteger).filter(e-> Collections.frequency(List.of(listOfInteger), e) == 1).collect(Collectors.toList());
        System.out.println("nonRepeatedInteger elements are -> "  + nonRepeatedInteger);

        Map<Integer, Long> elementWithCountInteger = Arrays.stream(listOfInteger).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue ));

        System.out.println("elementWithCountInteger is "+ elementWithCountInteger);





    }
}
