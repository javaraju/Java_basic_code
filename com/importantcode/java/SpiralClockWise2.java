package com.importantcode.java;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralClockWise2 {

	public static void main(String[] args) {
		int n=3;
		int arr[][]=new int[n][n];
		int count=n*n;
		int maxrow=n-1;//bcs array start from 0
		int maxcol=n-1;
		int minrow=0;
		int mincol=0;
		while(count>=1)
		{

			for(int j=maxcol;j>=mincol;j--) 
			{
				arr[maxrow][j]=count--;
			}
		
			for(int j=maxrow-1;j>=minrow;j--)
			{
				arr[j][mincol]=count--;
			}
			
		

			for(int i=mincol+1;i<=maxcol;i++)
			{
				arr[minrow][i]=count--;
			}
			
			

			for(int i=minrow+1;i<=maxrow-1;i++)
			{
				arr[i][maxcol]=count--;
			}
			
			
			
			
			
			//break;
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
