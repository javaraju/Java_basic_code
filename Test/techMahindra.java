package Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class techMahindra {

    public static void main(String[] args) {
        Map<String, Integer> unsortMap = new HashMap<>();

        unsortMap.put("z", 10);

        unsortMap.put("b", 5);

        unsortMap.put("a", 6);

        unsortMap.put("c", 20);

        unsortMap.put("d", 1);

        unsortMap.put("e", 7);

        unsortMap.put("y", 8);

        unsortMap.put("n", 99);

        unsortMap.put("g", 50);

        unsortMap.put("m", 2);

        unsortMap.put("f", 9);

        Map<String, Integer> sortedData = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
        System.out.println("sortedData --> "+sortedData);

        List<Map.Entry<String, Integer>> listOfEntrySet = new LinkedList<>(unsortMap.entrySet());
//       Collections.sort(listOfEntrySet, new Comparator<Map.Entry<String, Integer>>() {
//           @Override
//           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//               return o1.getValue().compareTo(o2.getValue());
//           }
//       });

        Collections.sort(listOfEntrySet, (Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)->
                     o1.getValue().compareTo(o2.getValue())) ;

//        listOfEntrySet.stream().forEach(System.out::print);

        Map<String, Integer> result = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : listOfEntrySet){
            result.put(entry.getKey(), entry.getValue());
        }
        System.out.println("non-stream After sorting map --> "+result);



        Map<String, Integer> sortedMap = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));

//        Iterator iter = sortedMap.entrySet().iterator();
//        for (iter.hasNext()){
//
//        }
        System.out.println("After using stream in increasing order --> "+ sortedMap);

        Map<String, Integer> reverse = unsortMap.entrySet().stream().sorted(Collections
                .reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
        System.out.println("After using stream  in reverseOrder--> "+ reverse);

        Iterator<Map.Entry<String, Integer>> itr = reverse.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
    }

}
