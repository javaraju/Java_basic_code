package com.pattern.java;

public class PatternE {
	public static void main(String[] args) {
		int n=4;
		int k;
		int m=n*2-1;
		for(int i=1;i<=n;i++)
		{    
			k=i;
			for(int j=1;j<=m;j++)
			{
				
				if(j>=5-i&&j<=3+i)
				{
					System.out.print(k);
					if(j>3)
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
