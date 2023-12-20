package com.AppsPatern.java;

public class DymondShap {

	public static void main(String[] args) {
		int n=17;
		int a=n/2+1;
		int k=0;
		int m=1;
		for(int i=1;i<=n;i++)
		{
			if(i<=a)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<=n;j++)
			{
				if(j>=n/2+2-k&&j<=n/2+k)
				{
					if(i<=a)
					{
					if(j<a)
					{
						System.out.print(m);
						m--;
					}
					else
					{
						System.out.print(m);
						m++;
					}
					}
					else if(i>a)
					{
						if(j<a)
						{
							System.out.print(m);
							m--;
						}
						else
						{
							System.out.print(m);
							m++;
						}						
					}					
				}				
				else
				{
					System.out.print(" ");
				}				
			}
			if(i>=a)
			{
				m=m-2;
			}			
			System.out.println();
		}
	}
}
