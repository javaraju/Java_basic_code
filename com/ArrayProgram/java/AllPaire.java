package com.ArrayProgram.java;

public class AllPaire {

	public static void main(String[] args) {
		int arr[]= {10,20,3,60,55,15,25,40,45,85,80};
		int n=100;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==n) {
					System.out.println(arr[i]+"+"+arr[j]+" = "+n);
				}
			}
		}



	}

}
