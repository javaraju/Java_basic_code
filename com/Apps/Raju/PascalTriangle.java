package com.Apps.Raju;

public class PascalTriangle {

	public static void main(String[] args) {
		int n=4;
		int m=n*2-1;
		int val=1;
		for(int i=1;i<=n;i++)
		{
			int k=0;
			for(int j=1;j<=m;j++)
			{
				
				if(j>=5-i&&j<=3+i&&k==0)
				{
					System.out.print(val);
					val=val*(i-j)/(j+1);
					k=1;
				}
				else
				{
					System.out.print(" ");
					k=0;
				}
				
			}
			System.out.println();
		}

	}

}
