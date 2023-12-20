package com.dddd.java;

public class Spherical {

	public static void main(String[] args) {
		int n=4;
		int m=n*2-1;


		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j>=n+1-i&&j<=n-1+i)
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
