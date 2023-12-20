package Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Accolite {

    public static void main(String [] args){

        List<Integer> list = List.of(1,2,3,4,4,5,6,6,6,7);

        Map<Integer, Long> data1 = list.stream().map(Integer::intValue)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e-> e.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<Integer,Long> s = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));



        Map<String, Long> data = list.stream().map(e-> String.valueOf(e))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e-> e.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("duplicate element with count is --> " + data);

        Set<Integer> result = list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());

        System.out.println("Result is --> " + result);

        List<Integer> listInt = Arrays.asList(1,2,3,4);

        List<Integer> result1 = listInt.stream().map(e-> e*2).collect(Collectors.toList());
        System.out.println("MakeDouble value-->"+ result1);

        int sumOfInteger = listInt.stream().filter(d -> d % 2 == 0).mapToInt(e->e).sum();
        System.out.println("Sum Value --->" + sumOfInteger);

        Map<Boolean, Integer> res = listInt.stream().collect(
                Collectors.partitioningBy(e-> e%2==0, Collectors.summingInt(x->x)));

        System.out.println("new sum result --->" + res);


        System.out.println(checkPrime(30));
    }
    public static boolean checkPrime(int num){

        int count = 0;
        for (int i=1; i< num/2;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count > 1){
            return false;
        }
        return true;
    }

}
