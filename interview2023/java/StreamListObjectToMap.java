package interview2023.java;

import com.AlphabeticPatterns.java.A;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private int rollNo;
    private String name;
    private int age;

    public Employee(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StreamListObjectToMap {

    public static void main(String [] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100, "Raju", 29));
        list.add(new Employee(101, "Vijay", 23));
        list.add(new Employee(102, "Hitesh", 24));
        list.add(new Employee(103, "Manoj", 30));

        Map<Integer, String> mapData = list.stream().collect(Collectors.toMap(Employee::getRollNo, Employee::getName));

        List<Map.Entry<Integer, String>> listOfEntry = new ArrayList<>(mapData.entrySet());
        Collections.sort(listOfEntry, new Comparator<Map.Entry<Integer, String>>(){
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });

//        Collections.sort(listOfEntry,(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) -> {
//                return o1.getValue().compareTo(o2.getValue());
//        });


//        Map<Integer, String> sortedMap = new HashMap<>();
//        for (Map.Entry entry:listOfEntry){
//            sortedMap.put(Integer.parseInt(String.valueOf(entry.getKey())), entry.getValue().toString());
//        }
        System.out.println(mapData);
        System.out.println(listOfEntry);
//        System.out.println(sortedMap);



        List<Character> list1 = Arrays.asList('D', 'e', 'm', 'o');
        String result = list1.stream().map(e->String.valueOf(e)).collect(Collectors.joining(""));
        System.out.println(result);

    }

}
