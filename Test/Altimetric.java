package Test;

import java.util.*;

public class Altimetric {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size !");

        int input = scanner.nextInt();
        int [] array = new int[input-1];

        System.out.println("Enter value of array!");
        for (int i=0; i<array.length; i++){
            array[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        List<Integer> missingData = new LinkedList<>();
        Arrays.sort(array);
        for (int i=0; i<array.length-1; i++){
            if ((array[i+1] - array[i]) > 1){
                missingData.add(array[i]+1);
            }
        }
        System.out.println(missingData);

//        List<Integer> list = List.of(1,4,6,7,9);
//        list.stream().mapToInt(e->e).max();
//        list.stream().mapToInt(e->e).sum();
//        list.stream();
        int maxValue = Arrays.stream(array).max().getAsInt();
        int expectedSum = (maxValue * (maxValue + 1))/2;
        System.out.println(expectedSum);
        int actualSum = Arrays.stream(array).sum();
        System.out.println(actualSum);
        int missingVariables = expectedSum-actualSum;
        System.out.println(missingVariables);

    }
}
