package com.AlphabeticPatterns.java;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int m=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==m||i==m)
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
