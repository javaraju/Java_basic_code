



package com.rs.java;
import java.util.*;
public class MatrixMultipication {
	public static void main(String[] args)
	{
	int[][] a= {{2,3,7}
	           ,{6,4,1},
	            {8,9,5}};
	
	int[][] b= {{1,2,4},
			    {3,6,7},
			    {8,5,2}};
	int[][] c=new int[3][3];
	
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
			c[i][j]+=a[i][k]*b[k][j];
			}
		}	
		
		
	}
	for (int[] is : c) {
		System.out.println(Arrays.toString(is));

	}
	
	}
}
