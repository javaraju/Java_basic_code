package com.pattern.java;

public class PatternDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{int k=1;
		
			for(int j=1;j<=7;j++)
			{
				
				if(j>=5-i&&j<=3+i)
				{
					System.out.print(k);
					//j<4?k++:k--;
					
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
