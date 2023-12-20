package com.ArrayProgram.java;

import java.util.Arrays;

public class DeleteIndexElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {66,88,99,33,11,44,74,14,12,55};
		System.out.println("Before deleting an Element:-\n "
				+Arrays.toString(array));
		for(int i=1;i<array.length-1;i++)
		{
			array[i]=array[i+1];
		}
		array[array.length-1]=array[array.length-1]+1;
		System.out.println("After deleting an Array:-");
		for(int arr:array)
		{
			System.out.println(" "+arr);
		}
		

	}

}
