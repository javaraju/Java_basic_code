package com.AppsPatern.java;

public class Pattern27 {

	public static void main(String[] args) {
		int n=10;
		char k='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=n+1-i)
				{
			       System.out.print(k);
				}
				else
				{
					System.out.print(" ");
				}
			}
			k++;
			System.out.println();
		}

	}

}
