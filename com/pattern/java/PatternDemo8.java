package com.pattern.java;

public class PatternDemo8 {
	public static void main(String[] args)
	{
		char ch;
		for(int i=1;i<=5;i++)
		{
			ch='A';
			for(int j=1;j<=9;j++)
			{
				
				if(j<=6-i||j>=4+i)
				{
					System.out.print(ch);
					ch++;
					//j<4?ch++:ch--;
					
				}
				else
				{
					System.out.print(" ");
				
				}
				
			}
			System.out.println(" ");
		}
	}

}
