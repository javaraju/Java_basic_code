package Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test210823 {
    public static void main(String[] args) throws Exception{
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

        Integer[] flattenedArray = flatten(array);

        System.out.println(Arrays.toString(flattenedArray));
    }

    public static Integer[] flatten(Object[] inputArray) throws Exception {

        Stream<Object> stream = Arrays.stream(inputArray);

        // Recursively flatten the array by mapping each element to a stream
        // of objects, and then concatenating all the streams into a single stream
        stream = stream.flatMap(o -> {
            try {
                return o instanceof Object[] ? Arrays.stream(flatten((Object[]) o)) : Stream.of(o);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        // Convert the stream of objects into an array of integers
        Integer[] flattenedArray = stream.toArray(Integer[]::new);

        return flattenedArray;

    }
}

///******************************************************************************
// Welcome to GDB Online.
// Code, Compile, Run and Debug online from anywhere in world.
// *******************************************************************************/
//import java.util.*;
//
//class Main
//{
//    public static void main(String[] args) {
//        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int splitSize = 3;
//
//		/* expected Output
//		[0, 1, 2]
//		[3, 4, 5]
//		[6, 7, 8]
//		[9]
//		*/
//
//        List<int[]> list = splitArray(original, splitSize);
//        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
//    }
//
//    public static List<int[]> splitArray(int[] array, int splitSize) {
//
//        List<int[]> returnlist = new LinkedList<>();
//
//        int number = splitSize;
//        int [] intarray = new int[splitSize];
//        int k=0;
//        int j=0;
//
//        for(int i=0; i<array.length; i++){
//
//            intarray[k] = array[i];
//            number --;
//            k++;
//            j++;
//            if (number == 0){
//                returnlist.add(intarray);
//                intarray = new int[splitSize];
//                number = splitSize;
//                k=0;
//            }
//        }
//        k=0;
//        while(j++ != array.length)
//        {
//            if(j == array.length){
//                break;
//            }
//            intarray = new int[array.length-j];
//            intarray[k] = array[j++];
//        }
//        returnlist.add(intarray);
//        return returnlist;
//
//    }
//}


