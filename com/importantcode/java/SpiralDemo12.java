package com.importantcode.java;
import java.util.Arrays;
import java.util.Scanner;


public class SpiralDemo12 {

	public static void main(String[] args) {
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
					for(int i=minrow;i<=maxrow;i++)
					{
						arr[i][mincol]=++count;
					}
					for(int i=mincol+1;i<=maxcol;i++)
					{
						arr[maxrow][i]=++count;
					}
					for(int i=maxrow-1;i>=mincol;i--)
					{
						arr[i][maxcol]=++count;
					}
					for(int i=maxcol-1;i>=mincol+1;i--)
					{
						arr[minrow][i]=++count;
					}
					minrow++;
					mincol++;
					maxrow--;
					maxcol--;
				}
				//give a row wise value
				System.out.println(Arrays.deepToString(arr)+"\n");
				
				//give row wise value without bracket
				for(int k=0;k<arr.length;k++) {
					for(int j=0;j<arr.length;j++)
					{
						System.out.print(arr[k][j]+" ");
					}
				}
				System.out.println("\n");
				
				
				//Give a value in the form of Matrix without Bracket 
				for(int k=0;k<arr.length;k++) {
					for(int j=0;j<arr.length;j++)
					{
						System.out.print(arr[k][j]+" ");
					}
					System.out.println(" ");
				}
				System.out.println("\n");
				
				
				
				//Give Matrix Form With Bracket
				for(int[] a:arr)
				{
					System.out.println(Arrays.toString(a));
				}

			}

		}


	}


