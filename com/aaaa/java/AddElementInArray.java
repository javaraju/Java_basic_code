package com.aaaa.java;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array of Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array of element is:-");
		System.out.println(Arrays.toString(arr));
	}
}
