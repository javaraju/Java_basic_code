package com.AppsPatern.java;

public class Pattern19 {

	public static void main(String[] args) {
		int n=5;
		char k='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n+1-i;j++)
			{
			       System.out.print(k++);	
			}
			k='A';
			System.out.println();
		}

	}

}