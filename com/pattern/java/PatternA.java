package com.pattern.java;

public class PatternA {

	public static void main(String[] args) {
		int n=7;
		int k=0;
		int m=0;
		for(int i=1;i<=n;i++)
		{
			if(i<=4)
			{
				k++;
				m++;
			}
			else
			{
				k--;
				m--;
			}
			for(int j=1;j<=n;j++)
			{
				if(j>=5-k&&j<=3+k)
				{
					System.out.print(m);
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
