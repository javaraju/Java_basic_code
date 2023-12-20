package com.dddd.java;

public class Pattern7 {

	public static void main(String[] args) {
		int n=10;
		int m=n*2-1;
		
		
		for(int i=1;i<=n;i++)
		{int count=0;
			for(int j=1;j<=m;j++)
			{
				
				if((j<=n+1-i||j>=n-1+i))
				{
					if(i==1) System.out.print(++count+" ");
					else if(j<=n+1-i)
					System.out.print(++count+" ");
					else
						System.out.print(count--+" ");

                        
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
