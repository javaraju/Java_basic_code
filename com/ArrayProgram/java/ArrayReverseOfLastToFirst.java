package com.ArrayProgram.java;

import java.util.Arrays;

public class ArrayReverseOfLastToFirst {
	public static int[] fun(int[] arr)
	{
		int n=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=n;
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		arr=fun(arr);
		System.out.println(Arrays.toString(arr));

	}

}
