package com.Practice.java;
import java.util.Scanner;
public class ArrayInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Element in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("your entered element in array is");
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
