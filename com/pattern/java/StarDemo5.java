package com.pattern.java;

public class StarDemo5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				int k=1;
				if(j>=6-i&&j<=4+i&&k<=1)
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
			System.out.println(" ");
		}
	}

}
