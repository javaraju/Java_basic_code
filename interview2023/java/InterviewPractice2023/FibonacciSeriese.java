package interview2023.java.InterviewPractice2023;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriese {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();
        int[] resultArray = new int[input];
        for (int i=1;i<=input;i++){
            resultArray[i-1] = fun(i);
            System.out.print(fun(i) + " ");
        }
        System.out.println();
        System.out.println("data is --> " + Arrays.toString(resultArray));
    }
    static int fun(int i){
        if (i==1 || i==2){
            return 1;
        }
        else {
            return (fun(i-1) + fun(i-2));
        }
    }
}
