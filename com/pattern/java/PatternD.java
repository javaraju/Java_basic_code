package com.pattern.java;

public class PatternD {

		public static void main(String[] args) {
			int n=9;
			int k=0;
			int m=n/2+1;
			for(int i=1;i<=n;i++)
			{
				if(i<=m)
				{
					k++;
				}
				else
				{
					k--;
				}
				for(int j=1;j<=m;j++)
				{
					if(j<=k)
					{
						System.out.print("*");
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

