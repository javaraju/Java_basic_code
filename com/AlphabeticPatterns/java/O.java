package com.AlphabeticPatterns.java;

public class O {

	public static void main(String[] args) {
		int n=11;
		int m=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==m||i==1||i==n)
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
