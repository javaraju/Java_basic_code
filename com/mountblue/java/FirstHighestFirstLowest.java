package com.mountblue.java;

import java.util.Arrays;

public class FirstHighestFirstLowest {
	public static int[]mix(int[]arr,int[]arr1)
	{
		int[]res=new int[arr.length+arr1.length];
		int i=0,j=arr1.length-1;
		int k=0;
		while(i<arr.length&&j>=0)
		{
			res[k++]=arr[i++];
		    res[k++]=arr1[j--];
		}
		while(i<arr.length)
		{
			res[k++]=arr[i++];
		}
		while(j>=0)
		{
			res[k++]=arr1[j--];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,55,33,42,51,21,10,9,5,13};
		int arr1[]= {3,54,64,42,35,62,3,9,4,7,2};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("arr1: "+Arrays.toString(arr1));
		int res[]=mix(arr,arr1);
		System.out.println(Arrays.toString(res));

	}

}
