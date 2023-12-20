package com.AlphabeticPatterns.java;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int m=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||i==n||i==m||j==1)
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
