package com.Practice.java;
import java.util.Arrays;
import java.util.Scanner;

public class JallebibaiPattern1 {
		static boolean isPrime(int n)
		{int flag=0;
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
						flag=1;
				}
				if(flag==0)
				{
					return true;


				}
				else

	           return false;
		}

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
					if(arr[i][j]==1)
					
						System.out.print("*"+"\t");
				
					else	if(isPrime(arr[i][j]))
					{
						System.out.print(arr[i][j]+"\t");
					}
					else
						System.out.print("*"+"\t");
				}
				System.out.println();
			}
			
		}

	}



