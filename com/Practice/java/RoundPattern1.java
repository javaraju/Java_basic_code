package com.Practice.java;

import java.util.Arrays;

public class RoundPattern1 {
	
	

	public static void main(String[] args) {
		int n=5;
		int count=0;
		int arr[][]=new int[n][n];
		char arr2;
		for(int i=1;i<n-1;i++)
		{
			arr[0][i]=++count;
		}
		for(int i=1;i<n-1;i++)
		{
			arr[i][n-1]=++count;
		}
		for(int i=n-2;i>0;i--)
		{
			arr[n-1][i]=++count;
		}
		for(int i=n-2;i>0;i--)
		{
			arr[i][0]=++count;
		}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(arr[i][j]==0)
				System.out.print("\t");
			else
				System.out.print(arr[i][j]+"\t");
		
		}
		System.out.println();
	}
	
	}

}
