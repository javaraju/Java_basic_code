package com.importantcode.java;
import java.util.Arrays;
import java.util.Scanner;


public class SpiralDemo13 {

	public static void main(String[] args) {
          {
				
				int arr[][]= 
					   {   {1,2,3,4},
						   {1,2,3,4},
						   {1,2,3,4},
						   {1,2,3,4}
						 };
				int count=0;
				int n=4;
				int maxcol,maxrow,mincol,minrow;
				maxcol=maxrow=n-1;
				mincol=minrow=0;
				while(true)
				{
					for(int i=mincol;i<=maxcol;i++)
					{
						System.out.print(arr[minrow][i]); ++count;
					}
					if(minrow==(n/2+1)&&mincol==(n/2+1))
						break;
					System.out.println();
					for(int i=minrow+1;i<=maxrow;i++)
					{
						System.out.print(arr[i][maxcol]); ++count;
					}
					System.out.println();
					for(int i=maxcol-1;i>=mincol;i--)
					{
						System.out.print(arr[maxrow][i]); ++count;
					}
					System.out.println();
					for(int i=maxrow-1;i>=minrow+1;i--)
					{
						System.out.print(arr[i][mincol]); ++count;
					}
					System.out.println();
					minrow++;
					mincol++;
					maxrow--;
					maxcol--;
				}
				
				System.out.println(" "+minrow+" "+mincol+" "+maxrow+" "+maxcol);

			}

		}


	}


