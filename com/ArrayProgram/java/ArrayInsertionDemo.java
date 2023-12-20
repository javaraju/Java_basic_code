package com.ArrayProgram.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertionDemo {

	public static void main(String[] args) {
		int arr[]= {66,55,88,99,2222,555,444,88,44,11};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index no where you want to add the value");
		
		int a=sc.nextInt();
		if(a<arr.length)
		{
		System.out.println("Enetr the value:-");
		int b=sc.nextInt();
		arr[a]=b;
		System.out.println(Arrays.toString(arr));
		}
		else
		{
			System.out.println("Array Index Out of Bound,,, Limit is :-"+(arr.length-1));
		}
		

	}

}
