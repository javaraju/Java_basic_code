package com.AlphabeticPatterns.java;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int m=n-2;
		int a=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==a&&i>=a||i==n&&j<=a||i==a&&j>=a||j==m&&i>=a||i==1&&j<=a)
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
