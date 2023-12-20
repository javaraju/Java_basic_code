package interview2023.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindMax {

    public static void main(String [] args){
        int array[] = new int[]{1,3,6,10,40,20,15};

        int max = array[0];
        int i=0;
        while (i<array.length){
            if (max < array[i]){
                max = array[i];
            }
            i ++;
        }
        System.out.println("Max value are : " + max);

        Integer maxValue = Arrays.stream(array).max().getAsInt();
        System.out.println("max value using stream -> " + maxValue);

        // Find second max

        int firstMax = array[0];
        int secondMax = firstMax;
        int j=0;
        while(j < array.length){
            if (firstMax < array[j]){
                secondMax = firstMax;
                firstMax = array[j];
            }
            else if(secondMax < array[j]){
                secondMax = array[j];
            }
            j++;
        }
        System.out.println("First max element is : " + firstMax);
        System.out.println("Second last element is : " + secondMax);

        // Find second max
        Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();

    }
}
