package com.importantcode.java;

import java.util.Arrays;

public class SecondHighestElemArray {

	public static void main(String[] args) {
		int array[]= {5,6,9,45,2,69,55,78,99};
		System.out.println("Beffore Sorting of Array is:");
		for(int b:array)
		{
			System.out.print(" "+b);
		}
		System.out.println(" ");
		Arrays.sort(array);
		System.out.println("After Sorting Array is:");
		for(int a:array)
		{
			System.out.print(" "+a);
		}
		System.out.println(" ");
		System.out.println("Second Highest element is: "+array[array.length-2]);
		System.out.println("Third Highest element is: "+array[array.length-3]);
	}
}
