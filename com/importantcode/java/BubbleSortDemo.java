package com.importantcode.java;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int arr[]= {5,3,9,4,6,2,8,7,6};
		System.out.println("Beffore Sorting");
		for(int c:arr)
		{
			System.out.println(c);
		}
		bubbleSort(arr);
		System.out.println("After sort");
		for(int c:arr)
		{
			System.out.println(c);
		}

	}
	private static void bubbleSort(int[] arr)
	{
		/*int temp=0;
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
		}*/
		int tmp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				{
				if(arr[i]>arr[j])
				{
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				
					
							
				}
			}
		}
	}
	

}
