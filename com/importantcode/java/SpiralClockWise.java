package com.importantcode.java;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralClockWise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int count=0;
		int maxrow=n-1;//bcs array start from 0
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
			for(int i=maxrow-1;i>=minrow;i--)
			{
				arr[i][maxcol]=++count;
			}
			for(int i=maxcol-1;i>=mincol+1;i--)
			{
				arr[minrow][i]=++count;
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
