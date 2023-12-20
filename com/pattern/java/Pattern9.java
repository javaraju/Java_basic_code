package com.pattern.java;

public class Pattern9 {

	public static void main(String[] args) {
		int n=11;
		int a=n/2;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			count++;
			for(int j=1;j<=n;j++)
			{
				
				
				
				if(count<=1||count>=n-1)
				{
					System.out.print("*");
				}
				else if(count==2)
				{
					if(j<=a||j>=a+a/2)
					{
					
					System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(count==6)
				{
					if(j<=a-1||j>=a*2-1)
					{
					
					System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(count==3)
				{
					if(j<=a-2||j==a+1||j>=a*2)
					{
					
					System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(count==4||count==5)
				{
					if(j<=a/2||j>=a*2)
					{
					
					System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(count==7)
				{
					if(j<=a||j>=a+a/2)
					{
					
					System.out.print("*");
					}
					else
						System.out.print(" ");
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
