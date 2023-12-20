package com.AppsPatern.java;

public class RightPyramid {

	public static void main(String[] args) {
		int n=7;
		int m=n/2+1;
		int k=0;
		int p=1;
		int u=0;
		for(int i=1;i<=n;i++)
		{
			if(i<=4)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<=m;j++)
			{
				if(j>=5-k)
				{					   
				    System.out.print(p-u);
				    u++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			u=0;
			System.out.println();
			if(i<4)
			{
				p++;
			}
			else
			{
				p--;
			}				
		}
	}
}
