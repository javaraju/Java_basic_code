package com.pattern.java;

public class PatternF {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{    
			int k=n-i;
			for(int j=1;j<=n;j++)
			{
				
				if(j<=8-i)
				{
					System.out.print(k--);
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



