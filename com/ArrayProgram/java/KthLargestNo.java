package com.ArrayProgram.java;

public class KthLargestNo {
			public static void main(String[] args) {
				int arr[]= {1,23,12,9,30,2,50};
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
				System.out.println();
				System.out.print("Three Largest No in Given No is:- ");
				for(int i=arr.length-1;i>=k;i--)
				{
				System.out.print(arr[i]+" ");
				}



	}

}
