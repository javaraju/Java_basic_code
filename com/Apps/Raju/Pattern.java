package com.Apps.Raju;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=n)
				{
					if(i==1||i==n||j==1||j==n)
					{
						System.out.print("I");
					}
					else if(i==2||i==n-1||j==2||j==n-1)
					{
						System.out.print("L");
					}
					else if(i==3||j==n-2)
					{
						System.out.print("U");
					}
					/* if(j==i)
					{
						System.out.print("*");
						
					}
					 
				    else if(j<=n-i)
					{
						System.out.print("X");
					}
					
					else if(j>=n+2-i)
					{
						System.out.print("Y");
					}
					else if(j==n+1-i)
					{
						System.out.print("#");
					} */
					
						
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
