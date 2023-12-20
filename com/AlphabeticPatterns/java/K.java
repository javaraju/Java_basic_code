package com.AlphabeticPatterns.java;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int m=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==m+1-i||i==m-1+j)
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
