package com.ArrayProgram.java;

public class KthSmallestNo {

	public static void main(String[] args) {
		int arr[]= {20,60,81,55,37,16,50,94,72};
		int temp;
		int k=4;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
						
			}
	
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		System.out.println("\n"+arr[k-1]);
		
		



	}

}
