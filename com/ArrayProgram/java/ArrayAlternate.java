package com.ArrayProgram.java;

import java.util.Arrays;

public class ArrayAlternate {

	public static void main(String[] args) {
		int n=5;
		int a=n/2+1;
		int arr[][]=new int[n][n];
		int maxrow=n-1;
		int minrow=0;
		int maxcol=n-1;
		int mincol=0;
		int count=0;
		while(count<n*n) {
		for(int i=mincol;i<=maxcol;i++)
		{
			arr[minrow][i]=++count;
		}
		for(int i=minrow+1;i<=maxrow;i++)
		{
			arr[i][maxcol]=++count;
		}
		for(int i=maxcol-1;i>=mincol;i--)
		{
			arr[maxrow][i]=++count;
		}
		for(int i=maxrow-1;i>=minrow+1;i--)
		{
			arr[i][mincol]=++count;
		}
		minrow++;
		maxrow--;
		mincol++;
		maxcol--;
		}
		for (int i = 1; i <= n; i++) {
			int m=1;
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n||m==1)
				{
					System.out.print("X"+"\t");
					m=0;
				}
			    else
			    {
						System.out.print("O"+"\t");
						m=1;
			    }
			}
			System.out.println();
				
		}
		


	}

}
