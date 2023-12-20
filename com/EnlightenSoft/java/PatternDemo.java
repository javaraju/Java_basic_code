package com.EnlightenSoft.java;

public class PatternDemo {

	public static void main(String[] args) {
		int n=5;
		int m=n*2-1;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=m;j++)
			{
				//if(j<=2*i-1)
				if(j<=k)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print("");
					
					
				}
				
				
			}
			k=k+2;
			System.out.println();
		}

	}

}
