package com.Tracxn.java;

import java.util.Arrays;

public class FoundMissingNumber {

	public static void main(String[] args) {
		int arr[]= {9,2,5,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length;i++)
		{
			int k=1;
			
			   while(arr[i-1]+k!=arr[i])
			     {
				   System.out.println(arr[i-1]+k);
				    k++;
				   
				
				
			     }
			   
			}
		

	}

}
