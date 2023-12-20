package com.ArrayProgram.java;

import java.util.Arrays;

public class ThreeDimArraySort {

	public static void main(String[] args) {
		int arr[][][]={
            {
            {66, 12, 55},
            {6, 5, 8},
            {14, 11, 20}
            },
            {
            {21, 2, 3},
            {4, 2, 6},
            {7, 2, 9}
            },
            {
            {88, 55, 33},
            {4, 3, 6},
            {7, 3, 9}
            },
        };
		System.out.println("Length of an array is:- "+arr.length+"\n");
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=1;k<arr.length;k++) 
				{
				if(arr[i][j][k-1]>arr[i][j][k])
					{
						
						temp=arr[i][j][k-1];
						arr[i][j][k-1]=arr[i][j][k];
						arr[i][j][k]=temp;
						
					}
				
					
				}
				
				
			}
		}
		System.out.println("After Sorting of Three Dimensional Array:-\n ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr.length;k++) 
				{
		           System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
		
			
		

	}

}
