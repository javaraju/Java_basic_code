package com.AppsPatern.java;

public class Pattern55 {
	public static void main(String[] args) {
		int n=7;
		int m=4;
		int k=0;
		int p=3;
		for(int i=1;i<=n;i++)
		{
			if(i<=4)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<=m;j++)
			{
				if(j<=k)
				{
					System.out.print(p--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			p=3;
			System.out.println();
		}

	}


}
