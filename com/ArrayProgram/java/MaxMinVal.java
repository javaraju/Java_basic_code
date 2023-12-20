package com.ArrayProgram.java;

public class MaxMinVal {

	public static void main(String[] args) {
		int arr[]= {5,9,8,10,4,55,77,500,100};
		int maxVal=arr[0];
		int minVal=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxVal)
			{
				maxVal=arr[i];
			}
			else if(arr[i]<minVal)
			{
				minVal=arr[i];
			}
		}
		System.out.println("MaxVal is= "+maxVal+" MinVal is= "+minVal );		

	}

}
