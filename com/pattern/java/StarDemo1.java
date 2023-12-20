package com.pattern.java;

public class StarDemo1 {

	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(count+++"\t");
					
				}
				else {
					System.out.print("");
				}
				
			}
			
			
			System.out.println("");
			
		}
		count++; 

	}

}
