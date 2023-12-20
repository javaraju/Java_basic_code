package com.pattern.java;

public class Pattern12 {
		public static void main(String[] args) {
			int count=1;
			int n=8;
			int c=n*2;
			int a=c/2;
			
			for(int i=1;i<=n;i++)
			{
				int k=1;
				for(int j=1;j<=c;j++)
				{
					if(j>=a+1-i&&j<=a-1+i&&k==1)
					{

							System.out.print("*");
							k=0;
					}
					else
					{
						System.out.print(" ");
						k=1;
					}
					
					
				}
				
				System.out.println();
			}

		}

	}
