package com.importantcode.java;

import java.util.Scanner;

public class AddElementInArray {

	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of Element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("Enter an Element of an Array");
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		sum=sum+arr[i];
		}
		
		System.out.println(sum);
	}

}
