package com.ExalcaTechnolodies.HSR;

import java.util.Arrays;

public class ShiftValueInLastOfArray {
	public static int[] zeroShifting(int[] arr)
	{
		int count=0;
		int k=0;
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[k++]=arr[i];
			}
		}
		if(count<arr.length)
		{
			arr1[k++]=0;
		}
		return arr1;
	}

	public static void main(String[] args) {
		int arr[]= {5,0,8,0,6,4,0,2,25,0,10,15,0,11,19,0,12};
		arr=zeroShifting(arr);
		System.out.println(Arrays.toString(arr));
	}

}
