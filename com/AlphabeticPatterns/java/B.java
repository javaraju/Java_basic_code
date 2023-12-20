package com.AlphabeticPatterns.java;

public class B {

	public static void main(String[] args) {
		int n=11;
		int m=n/2+1;
		int a=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||i==1&&j<m||j==m&&i>1&&i<a||i==n&&j<m||i==a&&j<m||j==m&&i>a&&i<n)
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
