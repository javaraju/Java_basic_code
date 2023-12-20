package com.pattern.java;

import java.util.Arrays;

public class SpiralPattern {

	public static void main(String[] args) {
		int n=4;
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
			for(int j=1;j<=n;j++)
			{
				if(n%2==1) {
					if((j==a+1-i||j==a-1+i||i==a-1+j||i==a+(n-j)))
				//if((j==a+1-i||j==a-1+i||i==a-1+j||i==a+(n-j)))
					//System.out.print("*"+"\t");
					
			         System.out.print(arr[i-1][j-1]+"\t");
				else
					System.out.print("*"+"\t");
					//System.out.print("\t");
					
				}
				else
				{

					if(i==1||j==1||i==n||j==n)
						
				         System.out.print(arr[i-1][j-1]+"\t");
					else
						System.out.print("\t");
				}
			}
			System.out.println();

		}
		
	
		
		

	}

}
