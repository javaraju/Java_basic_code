package com.ArrayProgram.java;

import java.util.Arrays;

public class ArrayStart2NoReverse {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int a=arr[0];
		int b=arr[1];
		int m=2;
		for(int i=0;i<=arr.length-3;i++)
		{
			arr[i]=arr[i+m];
			
		}
		arr[arr.length-1]=b;
		arr[arr.length-2]=a;
		System.out.println(Arrays.toString(arr));
		

	}

}
