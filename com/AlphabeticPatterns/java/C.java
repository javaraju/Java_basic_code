package com.AlphabeticPatterns.java;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int m=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1&&i>1&&i<n||i==1&&j>1&&j<m||i==n&&j>1&&j<m||j==m&&i>1&&i<3||j==m&&i>n-2&&i<n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
