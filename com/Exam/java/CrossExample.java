package com.Exam.java;

import java.util.Arrays;

public class CrossExample {

	public static void main(String[] args) 
	{
		int n=7;
		int arr[][]=new int[n][n];
		int r=4,c=4;
		int a,b;
		arr[r-1][c-1]=1;
		a=r-1;b=c-1;
		while(a<n&&b>=0)
		{
			arr[a][b]=1;
			a++;b--;
		}
		a=r-1;b=c-1;
		while(a<n&&b<n)
		{
			arr[a][b]=1;
			a++;b++;
		}
		a=r-1;b=c-1;
		while(a>=0&&b<n)
		{
			arr[a][b]=1;
			a--;b++;
		}
		a=r-1;b=c-1;
		while(a>=0&&b>=0)
		{
			arr[a][b]=1;
			a--;b--;
		}
		for(int[] k:arr)
		{
			System.out.println(Arrays.toString(k));
		}



	}

}
