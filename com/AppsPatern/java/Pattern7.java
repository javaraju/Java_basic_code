package com.AppsPatern.java;

public class Pattern7 {

	public static void main(String[] args) {
		int n=5;
		char k='E';
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				if(j<=n)
				{
			       System.out.print(k--);
			       
				}
				
			}
			k='E';
			System.out.println();
		}

	}

}
