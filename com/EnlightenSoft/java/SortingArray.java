package com.EnlightenSoft.java;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int arr[]= {50,40,6,10,70,20,5};
		
		
		/*for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));*/
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
			{
				arr[i-1]=arr[i]+(arr[i]=arr[i-1])-arr[i];
				i=0;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
