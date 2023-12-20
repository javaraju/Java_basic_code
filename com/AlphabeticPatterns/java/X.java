package com.AlphabeticPatterns.java;

public class X {

	public static void main(String[] args) {
		int n=11;
		int m=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==i||j==m+1-i)
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
