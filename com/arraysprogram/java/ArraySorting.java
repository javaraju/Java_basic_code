package com.arraysprogram.java;

import java.util.Arrays;

public class ArraySorting {
	public static int[] sort(int [] a)
	{
		int len=a.length,round,temp;
		for(round=1;round<len;round++ )
		{
			int flag=0;
			for(int i=0;i<=len-1-round;i++)
			{
				if(a[i]>a[i+1])
				{
					flag=1;
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			if(flag==0)//time complexsity decrease after using this.
			{
				System.out.println(round);
				break;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		//int arr[]= {1,2,3,4,5,6,7,8};
		int arr[]= {2,5,7,4,3,14,12,11};
		int arr1[]=sort(arr);
		System.out.println(Arrays.toString(arr1));
	}

}
