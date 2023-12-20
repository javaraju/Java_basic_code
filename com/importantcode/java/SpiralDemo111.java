package com.importantcode.java;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralDemo111 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int count=0;
		int maxcol,maxrow,mincol,minrow;
		maxcol=maxrow=n-1;
		mincol=minrow=0;
		while(count<n*n)
		{
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
			mincol++;
			maxrow--;
			maxcol--;
		}
		System.out.println(Arrays.deepToString(arr)+"\n");
		for(int k=0;k<arr.length;k++) {
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[k][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("\n");
		for(int k=0;k<arr.length;k++) {
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[k][j]+" ");
			}
		}
		System.out.println("\n");
		for(int[] a:arr)
		{
			System.out.println(Arrays.toString(a));
		}

	}

}
