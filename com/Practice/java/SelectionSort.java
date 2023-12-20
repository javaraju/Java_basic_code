package com.Practice.java;

public class SelectionSort {
	public static void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int index=i;//0
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]<arr[index])//arr[1]=2<arr[0]=11
						index=j;//2
				}
			}
			int smallerNumber=arr[index];//2
			arr[index]=arr[i];//arr[2]=8=
			arr[i]=smallerNumber;
		}
	}

	public static void main(String[] args) {
		int[] arr= {11,2,8,9,3,7,4};
		System.out.println("Before Sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		selectionSort(arr);
		System.out.println("\nAfter Sort");
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]+" ");
		}
		
	}

}
