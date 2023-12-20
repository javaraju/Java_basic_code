package com.EnlightenSoft.java;

public class CommonElementInArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,4,6,8};
		int arr2[]= {2,4,6,6,6,10,12,14};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
					break;
				}
			}
		}

	}

}
