package com.AlphabeticPatterns.java;

public class W {

	public static void main(String[] args) {
		int n=11;
		int m=n*2;
		int a=m/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==m||j==a-i&&i>1||j==a-1+i)
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
