package com.AlphabeticPatterns.java;

public class Q {

	public static void main(String[] args) {
		int n=10;
		int m=n;
		int a=m/2+2;
	     int b=a/2;
	     int k=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1&&j<a||j==1&&i<a||j==a&&i<a||i==a&&j<a+1||j==2+i-2&&i>3)
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
