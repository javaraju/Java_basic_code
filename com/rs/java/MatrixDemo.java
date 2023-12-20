package com.rs.java;
import java.util.*;
public class MatrixDemo {
	public static void main(String[] args)
	{
	int[][] a= {{2,3,7},{6,4,1},{8,9,5}};
	int[][] b= {{1,2,4},{3,6,7},{8,5,2}};
	int[][] c=new int[3][3];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" \t");
		}
		
		System.out.println("\n");
	}
	System.out.println();
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
			System.out.print(c[i][j]+"\t");
		}
		
		System.out.println("\n");
	}
	System.out.println();

	}
}
