package com.Apps.Raju;

import java.util.Scanner;
import java.util.Spliterator;

public class LargestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the Element of an Array:- ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.print("The Greatest Number is:- "+largest);

	}

}
