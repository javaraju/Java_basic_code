package com.AppsPatern.java;

public class Pattern49 {
	public static void main(String[] args) {
		int n=4;
		int m=7;
		int k=7;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j>=i&&j<=8-i)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print(" ");
				}
			}
			k-=2;
			System.out.println();
		}

	}

}
