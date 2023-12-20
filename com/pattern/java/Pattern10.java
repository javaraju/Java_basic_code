package com.pattern.java;

public class Pattern10 {

	public static void main(String[] args) {
		int n=5;
		int a=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				if(n%2==1){
				if(j==a+1-i||j==a-1+i||i==a-1+j||i==a+(n-j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				}
				else
				{
					if(i==1||j==1||i==n||j==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
