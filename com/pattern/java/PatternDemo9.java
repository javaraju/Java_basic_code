package com.pattern.java;

public class PatternDemo9 {

	public static void main(String[] args) 
	
	{
		System.out.println("drow pyramd pattern:-");
		drawPyramidPattern();
	}
		public static void drawPyramidPattern()
		{
			for (int i = 0; i < 5; i++)
			{
				for (int j = 0; j < 5 - i; j++)
				{
					System.out.print(" ");
					}
				for (int k = 0; k <= i; k++) 
				{
					System.out.print("* ");
					}
				System.out.println();
				}
			}

		}


