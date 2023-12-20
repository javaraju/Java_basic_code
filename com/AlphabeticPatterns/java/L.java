package com.AlphabeticPatterns.java;

public class L {

	public static void main(String[] args) {
		int n=11;
		int m=n/2+1;
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||i==n||j==m&&i>=n-2)
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
