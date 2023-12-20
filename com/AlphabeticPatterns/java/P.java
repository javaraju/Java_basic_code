package com.AlphabeticPatterns.java;

public class P {

	public static void main(String[] args) {
		int n=15;
		int m=n/2+1;
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||i==1&&j<m-1||i==m&&j<m-1
				||j==m-1&&i>1&&i<3||j==m-1&&i<m&&i>m-2||j==m&&i>2&&i<m-1)
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
