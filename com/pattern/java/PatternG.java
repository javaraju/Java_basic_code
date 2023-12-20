package com.pattern.java;

public class PatternG {
	public static void main(String[] args) {
		int n=9;
		int m=5;
		int k=m;
		for(int i=1;i<=n;i++)
		{    
			
			for(int j=1;j<=m;j++)
			{
				
				if(j>=k)
				{
					System.out.print("*");
					if(i<=m)
					{
						k--;
					}
					else
					{
						k++;
					}
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
