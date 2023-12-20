package com.Tracxn.java;

import java.util.Arrays;

public class ArrayZeroShorting {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,1,2,2,1,0,1,1};
		for(int i=0;i<arr.length-1;i++)
		{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					i=0;
				}
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
