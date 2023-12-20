package com.AparPeapleWorld.java;

public class SwapTwoArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int[] arr1= {6,7,8,9,10};
		System.out.println("Before swapping aar is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Before swapping aar1 is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		int []temp=new int[arr.length];
		for(int i=0;i<arr1.length;i++)
		{
			temp[i]=arr[i];
			arr[i]=arr1[i];
			arr1[i]=temp[i];
		}
		System.out.println();
		System.out.println("Aftre Swapping arr is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Aftre Swapping arr1 is:");
	    for(int i=0;i<arr1.length;i++)
	    {
		     System.out.print(arr1[i]+" ");
	    }
				
		
		

	}

}
