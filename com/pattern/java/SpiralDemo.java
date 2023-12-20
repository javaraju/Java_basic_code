package com.pattern.java;

import java.util.Arrays;

public class SpiralDemo {

	public static void main(String[] args) {
		int n=9;
		int arr[][]=new int[n][n];
		int maxcol=n-1,maxrow=n-1;
		int minrow=0,mincol=0;
		int count=n*n;
		while(count>0)
		{
			for(int i=maxcol;i>=mincol;i--)
			{
				arr[maxrow][i]=count--;
			}
			for(int i=maxrow-1;i>=minrow;i--)
			{
				arr[i][mincol]=count--;
			}
			for(int i=mincol+1;i<=maxcol;i++)
			{
				arr[minrow][i]=count--;
			}
			for(int i=minrow+1;i<=maxrow-1;i++)
			{
				arr[i][maxcol]=count--;
			}
			maxrow--;maxcol--;minrow++;mincol++;
			//break;
		}
		
		for(int[]a:arr)
		{
			System.out.println(Arrays.toString(a));
		}



	}

}
