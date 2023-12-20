package com.mountblue.java;
import java.util.Arrays;
public class CrossArray {

	public static void main(String[] args) {
		int n=6;
		int arr[][]=new int[n][n];
		int r=3,c=4;
		int row,col;
		row=r-1;col=c-1;
		while(row<n&&col>=0)
		{
			arr[row][col]=1;
			row++;col--;
		}
		row=r-1;col=c-1;
		while(row<n&&col<n)
		{
			arr[row][col]=1;
			row++;col++;
		}
		row=r-1;col=c-1;
		while(row>=0&&col<n)
		{
			arr[row][col]=1;
			row--;col++;
		}
		row=r-1;col=c-1;
		while(row>=0&&col>=0)
		{
			arr[row][col]=1;
			row--;col--;
		}
		row=r-1;col=c-1;
		while(col>=0&&col<n)
		{
			arr[row][col]=1;
			col++;
		}
		row=r-1;col=c-1;
		while(row>=0&&row<n)
		{
			arr[row][col]=1;
			row++;
		}
		row=r-1;col=c-1;
		while(row>=0&&row<n)
		{
			arr[row][col]=1;
			row--;
		}
		row=r-1;col=c-1;
		while(col>=0&&col<n)
		{
			arr[row][col]=1;
			col--;
		}
		for(int[] p:arr)
		{
			System.out.println(Arrays.toString(p));
		}

	}

}
