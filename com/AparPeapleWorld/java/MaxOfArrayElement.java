package com.AparPeapleWorld.java;

public class MaxOfArrayElement {

	public static void main(String[] args) {
		int arr[]= {52,20,80,79,66,44,23};
		int result=max(arr);
		System.out.println(result);
	}
	public static int max(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;



	}
	

}
