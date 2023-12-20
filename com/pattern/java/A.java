package com.pattern.java;

public class A {

	public static void main(String[] args) {
		
		int n=10;
		int a=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n;j++)
			{
				if(j==n+1-i||j==n-1+i||i==a&&j>a-1&&j<n+a)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
