package com.EnlightenSoft.java;

import java.util.Arrays;

public class ZeroShiftIntoBackInArray {
	static int[] BackToEnd(int[] arr,int n)
	{
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
			arr[k++]=arr[i];
			}
			
		}
		while(k<n)
		{
			arr[k++]=0;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {5,2,0,8,3,0,4,0,9,0,1,0,6};
		int n=arr.length;
		 arr=BackToEnd(arr,n);
		 System.out.println(Arrays.toString(arr));
	}

}
