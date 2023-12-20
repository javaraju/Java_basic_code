package com.AppsPatern.java;

public class Pattern32 {

	public static void main(String[] args) {
		int n=5;
		char k='E';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=i)
				{
			       System.out.print(k);
				}
				else
				{
					System.out.print(" ");
				}
			}
			k--;
			
			System.out.println();
		}
	}

}
