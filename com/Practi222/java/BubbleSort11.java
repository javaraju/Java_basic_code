package com.Practi222.java;

import java.util.Arrays;

public class BubbleSort11 {

	public static void main(String[] args) {
		int arr[]= {5,9,3,4,7,6,2,1,8,55,77,11,66};
		for(int i=0;i<arr.length-1;i++)
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
		
		System.out.println(Arrays.toString(arr));



	}

}
