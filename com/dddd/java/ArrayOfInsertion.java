package com.dddd.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfInsertion {

	public static void main(String[] args) {

		int a[]= {10,12,45,78,96,63,25,45,14,15,88};
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the Index no");
		int b=sc.nextInt();
		if(b<a.length) {
		System.out.println("enter the value");
		
		a[b]=sc.nextInt();
		System.out.println(Arrays.toString(a));

	}
		else
			System.out.println("Array index out of bound Exceptin:- "+a.length);*/
		/*int sum=0,average=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		average=sum/a.length;
		System.out.println("sum of an array is:- "+sum);
		System.out.println("Average of an array is: "+average);*/
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(""+a[i]);
				}
			}
		}
	}
}
