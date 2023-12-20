package com.Practice.java;

public class RoundShap {

	public static void main(String[] args) {
		int n=5;
		int a=n+1;
		int count=0;
		int count1=n-1;
		int count2=n*2+1;
		int count3=n*2+2;
	    int count4=n*2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=a;j++)
			{
				
				if(i==1&&j>1&&j<a||j==a&&i>1&&i<n||i==n&&j>1&&j<a||j==1&&i<n&&i>1)
				{
					if(i==1&&j>1&&j<a)
					{
					System.out.print(++count+" ");
					}
					else if(j==a&&i>1&&i<n)
					{
						System.out.print(++count1+" ");
					}
					
					else if(i==n&&j>1&&j<a)
					{
						if(n%2==0)
						{
						System.out.print(--count2+" ");
						}
						else if(n%2!=0) 
						{
							System.out.print(--count3+" ");
						}
					}
					else
						System.out.print(--count3+" ");
				    
				}
				
				else
				{
					System.out.print("  ");
					
				}
				
			}
			System.out.println();
			
		}
		
			

	}

}
