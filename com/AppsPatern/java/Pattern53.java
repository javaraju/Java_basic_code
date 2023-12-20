package com.AppsPatern.java;

public class Pattern53 {
	public static void main(String[] args) {
		int n=4;
		int m=7;
		char k='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j>=i&&j<=8-i)
				{
					System.out.print(k++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			k='A';
			System.out.println();
		}

	}


}
