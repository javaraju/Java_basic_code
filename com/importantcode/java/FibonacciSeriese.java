package com.importantcode.java;

import java.util.Scanner;

public class FibonacciSeriese {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a target value");
		int n=sc.nextInt();
		int arr[]=new int[n];
	    arr[0]=0;
	    arr[1]=1;
	    for(int i=2;i<arr.length;i++)
	    {
	    	arr[i]=arr[i-1]+arr[i-2];
	    	
	    }
	   // for(int i=0;i<arr.length;i++)
	    for(int i:arr)
	   // System.out.println(arr[i]);
	    System.out.println(i);
	    	
		

	}

}
