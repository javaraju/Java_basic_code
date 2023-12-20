package interview2023.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String [] args){
        Integer[] intArr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(intArr);
        Stream stream= list.stream().filter(c->c>5);
//        System.out.println(stream.);
    }
}
