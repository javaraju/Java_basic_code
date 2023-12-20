package com.AlphabeticPatterns.java;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int m=n/2;
		int a=m/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||i==n||j==a)
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
