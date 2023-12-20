package com.AppsPatern.java;

public class PiramidPatt {
	public static void main(String[] args) {
		int n=4;
		int m=n*2-1;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j>=5-i&&j<=3+i)
				{
					if(j<4)
					{
						System.out.print(k);
						k--;
					}
					else
					{
						System.out.print(k);
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
