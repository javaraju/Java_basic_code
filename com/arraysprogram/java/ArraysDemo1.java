package com.arraysprogram.java;

public class ArraysDemo1 {
	public static void main(String[] args)
	{
		int arr[]=new int[5];
		arr[0]=6;
		arr[1]=5;
		arr[2]=9;
		arr[3]=4;
		arr[4]=3;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array " + i + " is " +arr[i] );
		}
	}

}
