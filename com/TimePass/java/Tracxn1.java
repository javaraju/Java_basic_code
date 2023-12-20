package com.TimePass.java;

import java.util.Arrays;

public class Tracxn1 {
	public static int[] zeroInLast(int[] arr)
	{
		int k=0;
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[k++]=arr[i];
			}
		}
		if(k<arr.length)
		{
			arr1[k++]=0;
		}
		return arr1;
	}

	public static void main(String[] args) {
		int arr[]= {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9,0};
		arr=zeroInLast(arr);
		System.out.println(Arrays.toString(arr));



	}

}
