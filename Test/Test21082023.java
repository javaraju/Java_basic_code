package Test;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Formatter;

public class Test21082023 {

    public static void main(String[] args) {
        int [] array = {1,4,7,2,9};

        for (int i=0; i<array.length;i++){
            if(i+2 >=array.length) {
                array[0]= array[array.length-1];
            }

            else {
                int test = array[i+1];
                array[i + 1] = array[i];
                array[i+2] = test;
                i = i+2;
            }
        }
        System.out.println(Arrays.toString(array));


        for (int i=1; i<=10000; i++){
            if (isPrime(i)){
                System.out.println(i);
            }

        }
        double d = 200000;

        Formatter formatter = new Formatter();
        formatter.format("%,.2f", d);
        System.out.println("Formatted number with commas: " + formatter);

    }

    private static boolean isPrime(int number){
        int count = 0;
        for (int i=1; i<=number/2;i++){
            if (number%i==0){
                count++;
            }
        }
        if (count>1){
            return false;
        }
        else {
            return true;
        }
    }


}
