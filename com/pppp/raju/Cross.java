package com.pppp.raju;

import java.util.Arrays;

public class Cross {

	public static void main(String[] args) {
		int n=5;
		int arr[][]=new int[n][n];
		int row=3;
		int col=4;
		//arr[row-1][col-1]=1;
		int r,c;
		r=row-1; c=col-1;
		while(r<n&&c>=0)
		{
			arr[r][c]=1;
			r++;c--;
		}
		r=row-1; c=col-1;
		while(c<n&&r<n)
		{
			arr[r][c]=1;
			r++;c++;
		}
		r=row-1; c=col-1;
		while(c<n&&r>=0)
		{
			arr[r][c]=1;
			r--;c++;
		}
		r=row-1; c=col-1;
		while(c>=0&&r>=0)
		{
			arr[r][c]=1;
			r--;c--;
		}
		for(int[] a:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		

	}

}
