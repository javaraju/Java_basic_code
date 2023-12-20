package com.Apps.Raju;

import java.util.Scanner;

public class MaxMinArrays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of an Array:");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter Element of an  Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println("Max value of array is: "+max+",, Min value of an Array is: "+min);
		

	}

}
