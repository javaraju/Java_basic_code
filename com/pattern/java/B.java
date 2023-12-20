package com.pattern.java;

public class B {

	public static void main(String[] args) {
		int n=9;
		int a=n/2+2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(j==1||i==1||j==a||i==n||i==a-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
