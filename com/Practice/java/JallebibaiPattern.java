package com.Practice.java;

import java.util.Arrays;
import java.util.Scanner;

public class JallebibaiPattern {
	public static void main(String[] args) 
	{
		
		int n=5;
		int arr[][]=new int[n][n];
		int count=n*n+1;
		int maxrow,minrow,maxcol,mincol;
		maxrow=maxcol=n-1;minrow=mincol=0;
		while(count>1) 
		{
			for(int i=maxcol;i>=mincol;i--)
			{
				arr[maxrow][i]=--count;
			}
			for(int i=maxrow-1;i>=minrow;i--)
			{
				arr[i][mincol]=--count;
			}
			for(int i=mincol+1;i<=maxcol;i++)
			{
				arr[minrow][i]=--count;
			}
			for(int i=minrow+1;i<=maxrow-1;i++)
			{
				arr[i][maxcol]=--count;
			}
			//break;
			maxrow--;
			maxcol--;
			minrow++;
			mincol++;
			
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int n1=arr[i][j];
				int count2=0;
				for(int m=1;m<=n1;m++)
				{	
					if(n1%m==0)
						count2++;	
					}
				if(count2==2) System.out.print(arr[i][j]+"\t");
				else System.out.print("*"+"\t");

			}
			System.out.println();
		}
		
	}

}
