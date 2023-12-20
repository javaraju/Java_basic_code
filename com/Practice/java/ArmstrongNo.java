package com.Practice.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter an  Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("in ascending order");
		for(int a:arr)
		{
			System.out.println(a);
		}
		System.out.println("In descending order");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		

	}

}
