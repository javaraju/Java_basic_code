package com.pattern.java;

public class Patternppppp {

	public static void main(String[] args) {
		int n=7;
		int m=n/2+1;
		int x=0;
		for(int i=1;i<=n;i++)
		{
			
			if(i<=m)
			{
				x++;
			}
			else
			{
				x--;
			}
			for(int j=1;j<=m;j++)
			{
				if(j<=x)
				{
					System.out.print("*");
					
				}
					
			}
			System.out.println();
		}

	}

}
