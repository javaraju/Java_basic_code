package com.AppsPatern.java;

public class Pattern45 {
	public static void main(String[] args)
	{
		
			int n=5;
			int m=9;
			int k=1;
			for(int i=1;i<=n;i++)
			{				
				for(int j=1;j<=m;j++)
				{
					
					if(j>=6-i&&j<=4+i)
					{
						System.out.print(k);
						if(j<=4)
						{
							k++;
						}
						else if(j>=5)
						{
							k--;
						}
					}
					
					else
					{
					System.out.print(" ");
					}
					
					
				}
				k=1;
				System.out.println();
			}
				
	}

}
