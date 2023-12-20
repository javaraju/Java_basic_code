package com.mountblue.java;

import java.util.Arrays;

public class ScoreBord {

	public static void main(String[] args) {
		int arr[]= {200,180,150,100,75,75,33,18,11,5};
		int arr1[]= {300,145,115,86,65,42,37,19,7,220};
		int arr2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr1[i])
			{
				arr2[i]=i+2;
			}
			else if(arr[i]<arr1[i])
			{
				arr2[i]=i+1;
			}
		}
		System.out.println(Arrays.toString(arr2));

	}

}
