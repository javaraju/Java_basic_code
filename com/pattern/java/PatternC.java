package com.pattern.java;

public class PatternC {
	public static void main(String[] args) {
		int n=5;
		int a=n/2+1;
		int p=a-1;
		int m=a+1;
		int k=0;
		for(int i=1;i<=n;i++)
		{
			if(i<=a)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<=n;j++)
			{
				if(j<=m-k||j>=p+k)
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
