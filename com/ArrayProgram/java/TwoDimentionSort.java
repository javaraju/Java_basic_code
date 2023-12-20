package com.ArrayProgram.java;

import java.util.Arrays;

public class TwoDimentionSort {
	public static void main(String[] args) {
		int arr[][]= {{9,8,7},
				      {10,6,55},
				      {44,22,88}};
		System.out.println(arr.length);
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=1;k<arr.length;k++) 
				{
					if(arr[j][k-1]>arr[j][k])
					{
						
						temp=arr[j][k-1];
						arr[j][k-1]=arr[j][k];
						arr[j][k]=temp;
						
					}
				}
				
			}
		}
		for(int[]a:arr)
		System.out.println(Arrays.toString(a));
		
	}

}
