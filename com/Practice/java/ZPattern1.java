package com.Practice.java;

public class ZPattern1 {

	public static void main(String[] args) {
				int n=5;
				int a=n/2+1;
				int b=a*3;
				int c=b;
				int count=0;
			  for(int i=1;i<=n;i++)
			  {
				  for(int j=1;j<=n;j++)
				  {
					if(j==n||j==1||j==n+1-i) 
					{
						if(j==1)
						{
							System.out.print(++count+" ");
						}
						else  if(j==n)
						{
							System.out.print(b+++" ");
						}
						else
						{
							System.out.print(--c+" ");
						}
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



			





	


