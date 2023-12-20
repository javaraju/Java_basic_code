package com.EnlightenSoft.java;

public class Pattern {

	public static void main(String[] args) {
		int n=21;
		int m=n/2+1,p=n+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i<=m&&j<=p-i&&j>=i)||(i>m&&j>=p-i&&j<=i))
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
