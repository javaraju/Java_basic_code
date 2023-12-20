package interview2023.java.InterviewPractice2023;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String!");
        String first = sc.next();
        System.out.println("Enter second String!");
        String second = sc.next();
        char[] ch1 = first.toCharArray();
        char[] ch2 = second.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)){
            System.out.println("Given string is Anagram.");
        }
        else {
            System.out.println("Given string is not Anagram.");
        }
    }


}
