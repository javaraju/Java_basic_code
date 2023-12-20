package com.reimpliment.java;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int arr[]= {5,6,9,8,4,2,3,7,1};
		System.out.println("Before Sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		bubbleSort(arr);
		for(int c:arr)
		{
		System.out.println(c);
		}
	}
	private static void bubbleSort(int[] arr)
	{
		int temp=0;
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
				
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
				
				
			}
			
			
		}
		
	}

}
