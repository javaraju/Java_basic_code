package com.Practice.java;

import java.util.Arrays;

public class SpiralDemo {

	public static void main(String[] args) {
		int n=3;
		int count=0;
		int arr[][]=new int[n][n];
		int maxrow=n-1;
		int maxcol=n-1;
		int minrow=0;
		int mincol=0;
		while(count<n*n)
		{
			for(int i=minrow;i<=maxrow;i++)
			{
				arr[i][mincol]=++count;	
			}
			for(int i=mincol+1;i<=maxcol;i++)
			{
				arr[maxrow][i]=++count;
			}
			for(int j=maxrow-1;j>=minrow;j--)
			{
				arr[j][maxcol]=++count;
			}
			for(int j=maxcol-1;j>=mincol+1;j--)
			{
				arr[minrow][j]=++count;
			}
			
			maxrow--;
			maxcol--;
			minrow++;
			mincol++;
		}
		
		
		for(int[] a:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		
	}

}
