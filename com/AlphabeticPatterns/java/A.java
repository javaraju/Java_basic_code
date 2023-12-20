package com.AlphabeticPatterns.java;

public class A {

	public static void main(String[] args) {
		int n=15;
		int m=n*2-1;
		int a=n/2+1;
		int b=(n/2)+(m/2);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==n+1-i||j==n-1+i||i==a&&j>=a&&j<=b)
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
