package com.AlphabeticPatterns.java;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int m=n;
		int a=m/2+1;
		int b=a/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==a||j==b&&i>a-1||i==n&&j>b&&j<a)
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
