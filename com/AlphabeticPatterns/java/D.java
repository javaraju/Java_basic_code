package com.AlphabeticPatterns.java;

public class D {

	public static void main(String[] args) {
		int n=5;
		int m=n-2;
		int a=(m/2)/2;
		if(n>=6)
		{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1&&j<=m-2||j==a||i==n&&j<=m-2||j==m-1&&i>1&&i<3
						||j==m-1&&i>n-2&&i<n||j==m&&i>2&&i<n-1)
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
		else
		{
			System.out.println("Enter n value is Greater than of 5. ");
		}


	}

}
