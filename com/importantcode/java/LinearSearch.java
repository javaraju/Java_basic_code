package com.importantcode.java;

import java.util.Scanner;
import java.util.Spliterator;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the element of an Array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the Element for find the index ");
		int s=sc.nextInt();
		for(int j=0;j<array.length;j++)
		{
			if(array[j]==s)
			{
				System.out.println("Index No of "+s+" is:- "+j);
			}
		}

	}

}
