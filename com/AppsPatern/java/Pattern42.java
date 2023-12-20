package com.AppsPatern.java;

public class Pattern42 {

	public static void main(String[] args) {
		int n=5;
		int m=n*2-1;
		int h=n/2*2;
		char k='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j>=n+1-i&&j<=h+i)
				{
			       System.out.print(k++);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			k='A';
			System.out.println();
		}

	}

}
