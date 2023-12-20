package com.Practice.java;

import java.util.Arrays;
import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of an Array");
int n=sc.nextInt();
int array[][]=new int[n][n];
System.out.println("Enter the no of an Element");
for(int i=0;i<n*n;i++)
{
	for(int j=0;j<n*n;j++)
	{
	array[i][j]=sc.nextInt();
	}
}
for(int[] a:array)
{
	System.out.println(Arrays.toString(a));
}

	}

}
