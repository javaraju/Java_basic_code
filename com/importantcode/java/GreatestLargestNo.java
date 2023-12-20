package com.importantcode.java;
import java.util.Scanner;
public class GreatestLargestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array:-");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Element of an Array:-");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//int arr[]= {2,5,20,60,85,3,16,95};
		int a=Integer.MIN_VALUE;//-2147483648
		int b=Integer.MAX_VALUE;//2147483647
		for(int number:arr)
		{
			if(number>a)//2>-21......48 true,5>2,20>5........
				a=number;//2,5,20...,95
			
		}
		System.out.println("The largest number is: "+a);
		for(int number:arr)
		{
			if(number<b)
			{
				b=number;
			}
		}
		System.out.println("The smallest number is: "+b);

	}

}
