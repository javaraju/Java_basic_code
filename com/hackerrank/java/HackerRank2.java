package com.hackerrank.java;

import java.util.Scanner;

public class HackerRank2 {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no:");
        int t=in.nextInt();
        System.out.println("Enter a no:");
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int num = a;
            for(int j = 0; j < n; j++) {
                num += (((int) Math.pow(2, j)) * b);
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }

}
