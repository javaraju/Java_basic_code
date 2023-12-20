package com.AlphabeticPatterns.java;

public class T {

	public static void main(String[] args) {
		int n=11;
		int m=n;
		int a=m/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==a)
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
