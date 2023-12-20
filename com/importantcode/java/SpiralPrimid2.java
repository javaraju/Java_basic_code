package com.importantcode.java;

import java.util.Arrays;

public class SpiralPrimid2 
{
public static void main(String[] args) {

	int n=3;
	int arr[][]=new int[n][n];
	int maxrow,maxcol,mincol,minrow;
	
	maxrow=maxcol=n-1;
	mincol=minrow=0;
	int count=n*n+1;
	while(count>1)
	{
		for(int i=maxcol;i>=mincol;i--)
		{
			arr[maxrow][i]=--count;
		}
		//if(count<=0) break;
		for(int i=maxrow-1;i>=minrow;i--)
		{
			arr[i][mincol]=--count;
		}
		//if(count<=0) break;
		for(int i=mincol+1;i<=maxcol;i++)
		{
			arr[minrow][i]=--count;
		}
		//if(count<=0) break;
		for(int i=minrow+1;i<=maxrow-1;i++)
		{
			arr[i][maxcol]=--count;
		}
		
		//if(count<=0) break;
		mincol++;
		minrow++;
		maxcol--;
		maxrow--;
	}
	for(int[] a:arr)
	System.out.println(Arrays.toString(a));
}
}
