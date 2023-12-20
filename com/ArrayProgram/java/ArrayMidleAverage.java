package com.ArrayProgram.java;

public class ArrayMidleAverage {

	public static void main(String[] args) {
		int arr[]= {2,5,10,9,8,22};
		int arr1[]= {9,6,7,14,16,19};
		if(arr.length==arr1.length)
		{
		int a=arr[arr.length/2];	
		int b=arr1[arr1.length/2];
		int avr=(a+b)/2;
		System.out.println(avr);
		}
		else
		{
			System.out.println("arrays are of unequal size.");
		}
		
		

	}

}
