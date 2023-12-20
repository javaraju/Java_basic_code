package com.AppsPatern.java;

public class Pattern26 {

	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=n+1-i)
				{
			       System.out.print(k++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			k=1;
			System.out.println();
		}

	}

}
