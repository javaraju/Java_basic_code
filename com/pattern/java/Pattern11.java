package com.pattern.java;

public class Pattern11 {

	public static void main(String[] args) {
		int count=1;
		int n=8;
		int c=n*2;
		int a=c/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j>=a+1-i&&j<=a-1+i)
				{
					if(j>=a)
					{
						System.out.print(count--);
					}
					else
					{
					System.out.print(count++);
					}
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			count=1;
			System.out.println();
		}

	}

}
