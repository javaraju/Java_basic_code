package interview2023.java.InterviewPractice2023;

import java.util.Scanner;

public class ArmstrongNumber {

    public static int result(int value, int length){
        int sumOfData = 1;
        while(length>0){
            sumOfData = sumOfData*value;
            length --;
        }
        return sumOfData;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number!");
        int number = sc.nextInt();
        String numberToString = String.valueOf(number);
        int numberLength = numberToString.length();

        int r = 0, resultClone = number, sum = 0;
        while(number>0){
            r=number%10;
            number= number/10;
            sum = sum+result(r, numberLength);
        }
        if (sum == resultClone){
            System.out.println("given number is armstrong number.");
        }
        else {
            System.out.println("Given number is not armstrong number.");
        }
    }
}
