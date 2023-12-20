package com.EnlightenSoft.java;

import java.util.Arrays;

public class SortingEasy {

	public static void main(String[] args) {
		
		int arr[] ={5,9,10,4,2,6,7,8,20,15,80,50,42,60};
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
			{
				arr[i-1]=arr[i]+(arr[i]=arr[i-1])-arr[i-1];
				/*int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;*/
				i=0;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
