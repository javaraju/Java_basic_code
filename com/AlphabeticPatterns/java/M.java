package com.AlphabeticPatterns.java;

public class M {

	public static void main(String[] args) {
		int n=11;
		int m=n;
		int a=m/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==m||i==j&&j<=a||j==m+1-i&&i<=a+1)
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
