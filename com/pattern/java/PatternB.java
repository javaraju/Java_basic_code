package com.pattern.java;

public class PatternB {
	public static void main(String[] args) {
		int n=25;
		int a=n/2+2;
		int m=a-1;
		int k=0;
		for(int i=1;i<=n;i++)
		{
			if(i<=m)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<=n;j++)
			{
				if(j<=a-k)
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



