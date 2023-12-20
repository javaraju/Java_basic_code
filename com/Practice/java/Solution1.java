package com.Practice.java;


import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Int,Double,String");
        int i = scan.nextInt();
        double d=scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        //scan.nextLine();
        String s=scan2.nextLine();
       
        

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


